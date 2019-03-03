FROM openjdk:8-jdk-alpine
MAINTAINER "Stainley Lebron"
COPY /target/datasource.jar /datasource.jar
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=test", "/app.war"]
