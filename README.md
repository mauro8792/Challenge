# challengeSpring (miniTwitter)
This is a Spring Boot / Thymeleaf coding challenge. The first idea is create a mini Twitter saving the data into a MongoDB .

# Coding Challenge
## Description
This challenge consists of two services: Message Service, User Service.

An user can consume the Message service by creating messages that are identified by a messageId. These messages also need a valid user and some other data.

The User service need a valid mail and some other data.

## Usage
* Download the repository in any folder of your choice with Git:

`git clone https://github.com/nicobertolucci/challengeSpring.git`

* Build the application with Maven:

`mvn clean install`


## API specification

* `POST /User`
 
```
{
  userId: Number,
  email: String,
  dateOfBirth: String(YYYY-MM-DD),
  lastName: String,
  firstName: String,
  password: String,
  gender: String(Optional)
}
```

* `POST /Message`
```
{
  messageId: Number,
  message: String,
  fromUserId: Number,
  toUserId: Number
}
```

* `GET /Message/{id}`

`messageId: Number`


* `GET /User/{id}`

`userId: Number`

## Tech stack

* **Maven**: Maven’s primary goal is to allow a developer to comprehend the complete state of a development effort in the shortest period of time.
* **MongoDB**: Is a free and open-source cross-platform document-oriented database program. Classified as a NoSQL database program, MongoDB uses JSON-like documents with schemas.
* **Spring Boot**: Framework for developing and deploying services fast and with a light and concise configuration.
* **Spring Data**: Framework for developing database access and data consumption with ease and with a light configuration.

## TODO
* Create classes Message and User.
* Data input validation for the REST Controllers (mail, date, etc).
* Create a database on MongoDB.
* Create an User and send e-mail, and save it into a database.
* Send real emails with a server to User when create new user (now it's a stub) (search for dependencies of Spring Mail)
* **Java Mail**: Library for sending mails.
* Create a message and save it into a database OPTIONAL=[tagging an user].
* Create the corrects validations.
* Exception and error handling.
* Create a front-end with ThymeLeaf and consume the API Rest.

## References
* [Thymeleaf](http://www.thymeleaf.org/doc/tutorials/2.1/thymeleafspring.html)
* [Spring Boot Reference](https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/)
* [Create APIRest](https://spring.io/guides/gs/rest-service/)
* [Consume APIRest with JQuery](https://spring.io/guides/gs/consuming-rest-jquery/)
