# My Bank: A Microservices Demo Application

I am working on application where I am developing three microservices (Oauth-services, User-services, Account-services). These microservices built using Spring Boot, Spring Boot JPA, Microsoft SQL Server etc.

## Account Services: Overview and key features

An account service is responsible for managing and retrieve customer’s account. There are currently 2 endpoints defined. One is GET request (api/v1/accounts/{id}) for retrieving particular account information from database. Another one is PUT request (api/v1/accounts/{id}/changename) for updating “name” for account.

Note: 
 ### Future features:
I am working on more endpoints with different functionality where customer can retrieve all his/her accounts from customer number. Also, customer will have view basis on different capabilities of accounts. As different account has different capabilities based on product code of each account.

#### Why have I used V1 in URI?

: I have used v1 in URI to achieve versioning in RESTful services. Versioning helps us to iterate faster when the changes are identified.

## Use of Swagger documentation and UI:

A Swagger is an open-source tool. It builds around the OpenAPI Specification that helps developers to design, build, document, and consume RESTful APIs. 
There are below 2 dependencies which I have added in pom.xml file and created **SwaggerConfig.Java** class to get information about API’s which we have implemented in account services. Used Docket to achieve this functionality.
1.	springfox-swagger2
2.	springfox-swagger-ui
To get information about account services API using swagger, we just need to hit URL http://localhost:8080/v2/api-docs. 

## Achieved Content Negotiation: 

A service can have many representations, mostly because there may be multiple clients/customer expecting different representations. 
To achieve content negotiation, I have used **Jackson-dataformat-xml** dependency.

