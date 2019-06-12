# spring-boot-json-test

Demo project for Spring Boot testing with @JsonTest

## Requirements
* JDK8
* Apache Maven

## Test the Application

To test the application just type the following command:  

```
mvn test
```

## Aditional notes

At least on of the following dependencies must be included in `pom.xml` in order to loadthe `@JsonTest` required dependencies.

```xml
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-web</artifactId>
   <scope>test</scope>
</dependency>
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-json</artifactId>
   <scope>test</scope>
</dependency>

```

## References

* https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-testing.html
