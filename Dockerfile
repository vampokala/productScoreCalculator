# Use the official maven/Java 17 image to create a build artifact.
# https://hub.docker.com/_/maven
FROM maven:3.8.4-openjdk-17-slim AS build

# Copy local code to the container image.
WORKDIR /app
COPY pom.xml .
COPY src ./src
COPY src/main/resources /app/resources

# Build a release artifact.
RUN mvn package -DskipTests

# Use OpenJDK for runtime
FROM openjdk:17-slim

# Copy the jar to the production image from the builder stage.
COPY --from=build /app/target/*.jar /app/productcalc.jar

# Run the web service on container startup.
CMD ["java", "-jar", "/app/productcalc.jar"]