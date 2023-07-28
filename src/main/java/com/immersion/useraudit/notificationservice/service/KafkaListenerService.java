package com.immersion.useraudit.notificationservice.service;

import com.immersion.useraudit.notificationservice.domain.model.NotificationEvent;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaListenerService {
    @KafkaListener(topics = "${kafka.user-audit.consumer.topic-name}", groupId = "${kafka.user-audit.consumer.group-id}")
    public void listen(ConsumerRecord<String, NotificationEvent> consumerRecord) {
        log.info("Able to listen to the topic: {}", consumerRecord.value());
    }
}
