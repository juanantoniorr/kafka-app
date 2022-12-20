package com.course.kafka.kafkaproducer;

import com.course.kafka.kafkaproducer.entity.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmployeeJsonProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(FixedRateProducer.class);
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    @Autowired
    ObjectMapper objectMapper;

    public void sendMessage(Employee employee) throws JsonProcessingException {
        String  json = objectMapper.writeValueAsString(employee);
        kafkaTemplate.send("t-employee", json);
    }
}
