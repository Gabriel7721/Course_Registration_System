package com.iuh.kttkpm.be.registCourses.kafkas.producer;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String ENROLLMENT_TOPIC = "enrollment_topic";
    private static final String ENROLLMENT_CANCEL_TOPIC = "enrollment_cancel_topic";

    public void sendEnrollmentMessage(String studentId, String courseId) {
        String message = String.format("{\"studentId\":\"%s\", \"sectionClassId\":\"%s\"}", studentId, courseId);
        kafkaTemplate.send(ENROLLMENT_TOPIC, message);
    }

    public void sendCancelEnrollmentMessage(Long registionId) {
        kafkaTemplate.send(ENROLLMENT_CANCEL_TOPIC, registionId.toString());
    }
}
