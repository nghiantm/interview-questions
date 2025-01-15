# Get maven image from Docker Hub
FROM maven

# Copy the current folder which contains java source code and tests to the Docker image under /usr/src
COPY . /usr/src/

#COPY pom.xml /usr/src/

# Specify the working directory
WORKDIR /usr/src/

# Use maven to package the jar assuming the tests passed
RUN mvn -X package

# Run the program output from the previous step
CMD ["java", "-jar", "target/lru-java-0.0.1.jar"]
