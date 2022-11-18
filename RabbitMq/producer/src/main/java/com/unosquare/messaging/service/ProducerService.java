package com.unosquare.messaging.service;


import com.unosquare.messaging.entity.Product;

public interface ProducerService {
    void sendToDirectExchange(Product payload, String routingKey);

    void sendToTopicExchange(Product payload, String topic);

    //Send to all queues
    void sendToFanoutExchange(Product payload);
}
