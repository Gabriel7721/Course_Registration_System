package com.iuh.kttkpm.be.registCourses.kafkas.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic enrollmentTopic() {
        return new NewTopic("enrollment_topic", 1, (short) 1);
    }

    @Bean
    public NewTopic enrollmentCancelTopic() {
        return new NewTopic("enrollment_cancel_topic", 1, (short) 1);
    }
}
