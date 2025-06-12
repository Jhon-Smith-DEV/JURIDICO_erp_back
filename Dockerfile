# Archivo: Dockerfile
FROM openjdk:17-jdk-slim as builder
WORKDIR /app
COPY target/ERP-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]