# Use an OpenJDK image with Maven to build and run the app
# FROM maven:3.8.7-openjdk-17 AS build
FROM openjdk:17-jdk-alpine

# Copy the built JAR from the build stage
ADD target/*.jar app.jar

# Run the Java application
ENTRYPOINT ["java", "-jar", "app.jar"]
