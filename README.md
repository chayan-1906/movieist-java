# MovieIST Java

<br>
https://youtu.be/5PdEmeopJVQ

https://www.themoviedb.org/talk/61af7321a3e4ba004199a725#61af7321a3e4ba004199a728
https://developer.themoviedb.org/reference/discover-movie

The server runs on Tomcat, on <http://localhost:9091>
Route | METHOD | Description
---------------------------- | ------ | -------------
/api/v1/movies | GET | Get all movies
/api/v1/movies?imdbId={imdbId} | GET | Get movie by imdbId
/api/v1/reviews | POST | Create a review for a movie

## Dependencies

* [Spring Boot Starter Data MongoDB](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-mongodb)
* [Spring Boot Starter Web](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web)
* [Spring Boot DevTools](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools)
* [Lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok)
* [Spring Boot Starter Test](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test)
* [Dotenv](https://mvnrepository.com/artifact/me.paulschwarz/spring-dotenv)
* [Spring Boot Configuration Processor](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-configuration-processor)
