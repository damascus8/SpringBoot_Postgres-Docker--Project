# Step 1: Use an official JDK image as the base image
FROM openjdk

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the compiled JAR file (assumes you've built the application before)
COPY target/DataSaver-0.0.1-SNAPSHOT.jar /app/DataSaver-0.0.1-SNAPSHOT.jar

# Step 4: Expose the port the application will run on
EXPOSE 8080

# Step 5: Define the command to run the Spring Boot application
CMD ["java", "-jar", "/app/DataSaver-0.0.1-SNAPSHOT.jar"]
