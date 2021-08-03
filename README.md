# lms-admin-rest-service
Don't forget to give this project a ⭐

Learn how to create RESTful web services using Spring Boot.

Spring Boot helps you to create Spring-powered, production-grade applications and services with absolute minimum fuss. It takes an opinionated view of the Spring platform so that new and existing users can quickly get to the bits they need.

**<ins>Installing Tools:</ins>**

* [Install JDK 11 & Apache Maven 3.6](https://anote.dev/install-jdk-11-apache-maven-3-6/)
* [Eclipse](https://www.guru99.com/install-eclipse-java.html)
* [Spring](https://www.eclipse.org/community/eclipse_newsletter/2018/february/springboot.php)
* [Postgres SQL](https://www.postgresqltutorial.com/install-postgresql/)

The [reference documentation](https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/html/) includes detailed [installation instructions](https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/html/getting-started.html#getting-started.installing) as well as a comprehensive getting started [guide](https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/html/getting-started.html#getting-started.first-application).

**<ins>Database:</ins>**

  Syntax
    The basic syntax of CREATE DATABASE statement is as follows −

 
     CREATE DATABASE dbname;
     where dbname is the name of a database to create.

  Example
    The following is a simple example, which will create testdb in your PostgreSQL schema<br>
      CREATE DATABASE testdb;
    <BR>Please update the jdbc properties in application.properties(lms-admin-rest-service\src\main\resources)
    
      spring.datasource.url=jdbc:postgresql://localhost:5432/testdb
      spring.datasource.username=postgres
      spring.datasource.password=postgres

**<ins>Running the Application in local environment</ins>**
  
Now, we can run our example war with two simple commands:

* $ mvn clean package spring-boot:repackage
* $ java -jar target/lms-admin-rest-service-0.0.1-SNAPSHOT.jar
<BR>More details regarding how to run a jar file can be found in our article Run [JAR Application With Command Line Arguments](https://www.baeldung.com/java-run-jar-with-arguments).
Once deployed, you can access the app at:

https://localhost:8080

You need to configure your own username and password in application.properties
  
    spring.security.user.name=admin
    spring.security.user.password=password
 
  **<ins>Swagger UI</ins>**
  
  Swagger UI is a built-in solution that makes user interaction with the Swagger-generated API documentation much easier.
  Now we can test it in our browser by visiting:

  http://localhost:8080/swagger-ui/
  
  **<ins>Running the Application in Heroku Cloud environment</ins>**
  
  Please refer this [article](https://www.callicoder.com/deploy-host-spring-boot-apps-on-heroku/) 
  
  **<ins>Actuator</ins>**
  
  Actuator brings production-ready features to our application. Monitoring our app, gathering metrics, understanding traffic, or the state of our database become trivial with this dependency.
  The main benefit of this library is that we can get production-grade tools without having to actually implement these features ourselves.
    
  **<ins>Enabling Endpoints</ins>**
  
    management.health.diskspace.enabled=true
    management.health.db.enabled=true
    management.endpoint.health.show-details=always
    management.endpoints.web.base-path=/
    management.endpoints.web.exposure.include=*
    management.metrics.export.datadog.enabled=true
    management.trace.http.enabled=true
  
  Let's have a look at some available endpoints, most of which were available in 1.x already.Also, some endpoints have been added, some removed and some have been restructured:
  - /auditevents lists security audit-related events such as user login/logout. Also, we can filter by principal or type among other fields.
  - /beans returns all available beans in our BeanFactory. Unlike /auditevents, it doesn't support filtering.
  - /conditions, formerly known as /autoconfig, builds a report of conditions around autoconfiguration.
  - /configprops allows us to fetch all @ConfigurationProperties beans.
  - /env returns the current environment properties. Additionally, we can retrieve single properties.
  - /flyway provides details about our Flyway database migrations.
  - /health summarizes the health status of our application.
  - /heapdump builds and returns a heap dump from the JVM used by our application.
  - /info returns general information. It might be custom data, build information or details about the latest commit.
  - /liquibase behaves like /flyway but for Liquibase.
  - /logfile returns ordinary application logs.
  - /loggers enables us to query and modify the logging level of our application.
  - /metrics details metrics of our application. This might include generic metrics as well as custom ones.
  - /prometheus returns metrics like the previous one, but formatted to work with a Prometheus server.
  - /scheduledtasks provides details about every scheduled task within our application.
  - /sessions lists HTTP sessions given we are using Spring Session.
  - /shutdown performs a graceful shutdown of the application.
  - /threaddump dumps the thread information of the underlying JVM.
  
  **Thanks for visiting. Enjoy Coding...**
  
 
  

