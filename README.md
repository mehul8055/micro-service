# micro-service
This Repository will contains detail example of Spring Boot Micro Service 

- eureka-server : This is an Eureka Server for Location transperency (Provide Naming Service) 
  - Eureka Server URL : http://localhost:7681/ 
- zuul-api-gateway : This is a Zuul API Gateway - mainly used for common task across micro services - like any Filter 
  This internally publiced log in Zipkin through RabbitMQ 
  for distributed logging trace we need to install RabbitMQ and need to start Zipkin using jar file 
  - set Env Variable : "set RABBIT_URI=amqp://localhost"
  - Download this file from net "zipkin-server-2.16.2-exec"
- item-order-service : Provide the order using item-service internally 
  - this is a sample URL to hit from browser http://localhost:8081/item-order/4/qnt/6
- item-service : Provide Item details 
  - This service required the mysql database schema named "item-service", it will automatically create table name "item" automatically 
  then add some data in this "item" table 

  
  
