package com.immersion.useraudit.notificationservice.service;

import com.immersion.useraudit.notificationservice.domain.model.NotificationEvent;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

public class KafkaListenerService {
    @KafkaListener(topics = "${kafka.user-audit.consumer.topic-name}", groupId = "${kafka.user-audit.consumer.group-id}")
    public void listen(ConsumerRecord<String, NotificationEvent> consumerRecord) {

    }
}
