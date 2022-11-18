package com.unosquare.messaging.controller;

import com.unosquare.messaging.entity.Product;
import com.unosquare.messaging.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/producer")
public class ProducerRestController {

    @Autowired
    private ProducerService producerService;

    @PostMapping(value = "/direct/{routingKey}")
    public ResponseEntity sendDirectExchange(@PathVariable(value = "routingKey") String routingKey
    , @RequestBody Product product){
        producerService.sendToDirectExchange(product, routingKey);
        return ResponseEntity.status(HttpStatus.OK).build();

    }
//Looks for pattern in queue
    @PostMapping(value = "/topic/{topic}")
    public ResponseEntity sendToTopicExchange(@PathVariable(value = "topic") String topic
            , @RequestBody Product product){
        producerService.sendToTopicExchange(product,topic);
        return ResponseEntity.status(HttpStatus.OK).build();

    }
    @PostMapping(value = "/fanout")
    public ResponseEntity sentToFanoutExchange(@RequestBody Product product){
        producerService.sendToFanoutExchange(product);
        return ResponseEntity.status(HttpStatus.OK).build();
    }



}
