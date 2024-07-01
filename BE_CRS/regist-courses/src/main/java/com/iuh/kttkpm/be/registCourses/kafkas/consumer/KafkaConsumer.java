package com.iuh.kttkpm.be.registCourses.kafkas.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iuh.kttkpm.be.registCourses.client.LookUpPointClient;
import com.iuh.kttkpm.be.registCourses.dtos.RegistionRequest;
import com.iuh.kttkpm.be.registCourses.models.Registion;
import com.iuh.kttkpm.be.registCourses.models.SectionClass;
import com.iuh.kttkpm.be.registCourses.repositories.RegistionRepository;
import com.iuh.kttkpm.be.registCourses.repositories.SectionClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumer {
    private final RegistionRepository registionRepository;
    private final LookUpPointClient lookUpPointClient;
    private final SectionClassRepository sectionClassRepository;
    private final ObjectMapper objectMapper;


    @KafkaListener(topics = "enrollment_topic", groupId = "registCourses")
    public void consume(String message) {
        try {

            RegistionRequest request = objectMapper.readValue(message, RegistionRequest.class);
            Registion registion = new Registion();
            registion.setStudent(lookUpPointClient.getStudentById(Long.valueOf(request.getStudentId())));
            SectionClass sectionClass = sectionClassRepository.findById(Long.valueOf(request.getSectionClassId())).get();
            registion.setSectionClass(sectionClass);
            registionRepository.save(registion);
            sectionClass.setStudentNumber(sectionClass.getStudentNumber() + 1);
            sectionClassRepository.save(sectionClass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    hủy
    @KafkaListener(topics = "enrollment_cancel_topic", groupId = "registCourses")
    public void consumeCancel(String registionId) {
        try {
            Registion registion = registionRepository.findById(Long.valueOf(registionId)).get();
            registionRepository.delete(registion);
            SectionClass sectionClass = sectionClassRepository.findById(registion.getSectionClass().getSectionClassId()).get();
            sectionClass.setStudentNumber(sectionClass.getStudentNumber() - 1);
            sectionClassRepository.save(sectionClass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}