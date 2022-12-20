package com.course.kafka.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloKafka {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    public void sendMessage(String name){
        //Topic already created via command line
        kafkaTemplate.send("topic-hello", "Hello " + name);
        System.out.println("Message delivered");
    }


}
