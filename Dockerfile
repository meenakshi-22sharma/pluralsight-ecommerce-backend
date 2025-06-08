# Use a lightweight OpenJDK image as the base
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file into the container
COPY target/*.jar app.jar

# Expose the port the app runs on (update if your app uses a different port)
EXPOSE 8000

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
