# RabbitMQ Service



Spring boot application with RabbitMQ that sends a simple Entity Product between a producer and a consumer using JMS RabbitMQ

## Rest Endpoints
- /api/producer/direct/direct1
Where direct1 = routing key, Direct exchange to queue A.
- /api/producer/direct/direct2
Where direct2= routing key, Direct exchange to queue B.
- /api/producer/topic/rabbitmq.learning 
 Where rabbitmq.learning = routing key, Topic exchange to queue C.
- /api/producer/topic/rabbitmq.spring.learning 
Where rabbitmq.spring.learning = routing key, Topic exchange to queue C,D.
- /api/producer/fanout 
Fanout exchange to queue E,F

