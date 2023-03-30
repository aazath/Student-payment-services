Skiply Microservices
This repository contains two Spring Boot microservices: Skiply Student Service and Skiply Payment Service.

Skiply Student Service
Skiply Student Service is a microservice that manages student-related data. It provides RESTful endpoints for CRUD operations on student entities. The service also integrates with a database to store and retrieve data.

Technologies Used
Java
Spring Boot
Spring Data JPA
H2 In-memory Data

How to Run
To run the Skiply Student Service, you must have Java 17 installed on your system. Follow these steps:

Clone this repository.
Open the skiply-student-service directory in a terminal.
Run ./mvnw spring-boot:run to start the service.
The service will start running on http://localhost:8080.

Skiply Payment Service
Skiply Payment Service is a microservice that handles payments. It provides RESTful endpoints for creating and processing payments.

Technologies Used
Java
Spring Boot
Spring Data JPA
H2 In-memory Data

How to Run
To run the Skiply Payment Service, you must have Java 17 installed on your system. Follow these steps:

Clone this repository.
Open the skiply-payment-service directory in a terminal.
Run ./mvnw spring-boot:run to start the service.
The service will start running on http://localhost:8081.

API Documentation
Both services provide Swagger API documentation, which you can access by visiting the following URLs:

Skiply Student Service: http://localhost:8080/swagger-ui.html -> /v2/api-docs
Skiply Payment Service: http://localhost:8081/swagger-ui.html -> /v2/api-docs

Conclusion
This repository contains two Spring Boot microservices that demonstrate how to build RESTful services using Spring Boot. We hope you find them useful!




