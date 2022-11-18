package com.unosquare.messaging.listener;

import com.unosquare.messaging.entity.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class JMSReceiver {
    private static final Logger LOGGER = LoggerFactory.getLogger(JMSReceiver.class);

    @RabbitListener(queues = "queue-A")
    public void handleQueueAMessageReception(Product payload) {
        LOGGER.info("Message received in Queue A : " + payload.getName());
    }

    @RabbitListener(queues = "queue-B")
    public void handleQueueBMessageReception(Product payload) {
        LOGGER.info("Message received in Queue B : " + payload.getName());
    }

    @RabbitListener(queues = "queue-C")
    public void handleQueueCMessageReception(Product payload) {
        LOGGER.info("Message received in Queue C : " + payload.getName());
    }

    @RabbitListener(queues = "queue-D")
    public void handleQueueDMessageReception(Product payload) {
        LOGGER.info("Message received in Queue D : " + payload.getName());
    }
    @RabbitListener(queues = "queue-E")
    public void handleQueueEMessageReception(Product payload) {
        LOGGER.info("Message received in Queue E : " + payload.getName());
    }
    @RabbitListener(queues = "queue-F")
    public void handleQueueFMessageReception(Product payload) {
        LOGGER.info("Message received in Queue F : " + payload.getName());
    }
}
