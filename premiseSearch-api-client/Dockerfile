# Dockerfile
FROM openjdk:11-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} premiseSearch-api-client.jar


ENTRYPOINT ["java","-Xdebug", "-Xrunjdwp:transport=dt_socket,address=8000,server=y,suspend=n","-jar","/premiseSearch-api-client.jar"]