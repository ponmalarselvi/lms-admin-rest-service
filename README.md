# lms-admin-rest-service
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

**<ins>Running the Application</ins>**
Now, we can run our example war with two simple commands:

* $ mvn clean package spring-boot:repackage
* $ java -jar target/spring-boot-ops.war
<BR>More details regarding how to run a jar file can be found in our article Run [JAR Application With Command Line Arguments](https://www.baeldung.com/java-run-jar-with-arguments).
Once deployed, you can access the app at:

https://localhost:8080

You need to configure your own username and password in application.properties
  
  spring.security.user.name=admin

  spring.security.user.password=password
  
  Thanks for visiting. Enjoy Coding...
  
 
  

