# Dockerfile
FROM openjdk:11-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} cmxdemo.jar
ENTRYPOINT ["java","-jar","/cmxdemo.jar"]