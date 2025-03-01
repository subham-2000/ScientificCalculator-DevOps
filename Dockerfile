# Use an OpenJDK image with Maven to build and run the app
# FROM maven:3.8.7-openjdk-17 AS build
FROM openjdk:17-jdk-alpine
# Set working directory
WORKDIR /app

# Copy the Java project files into the container
COPY . .

# Build the project using Maven
RUN mvn clean package

# Use a smaller OpenJDK runtime for running the built JAR
FROM openjdk:17

# Set working directory
WORKDIR /app

# Copy the built JAR from the build stage
COPY --from=build /app/target/*.jar app.jar

# Run the Java application
ENTRYPOINT ["java", "-jar", "app.jar"]
