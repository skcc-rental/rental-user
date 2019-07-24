#FROM openjdk:8-jre-alpine
#COPY target/rental-user-0.0.1-SNAPSHOT-shaded.jar app.jar
#CMD ["java","-jar","app.jar"]
FROM maven:3.5-jdk-8

# copy the project files
COPY ./pom.xml ./pom.xml

# build all dependencies for offline use
RUN mvn dependency:go-offline -B

# copy your other files
COPY ./src ./src

# build for release
RUN mvn package

EXPOSE 11001
# set the startup command to run your binary
CMD ["java", "-jar", "./target/rental-user-0.0.1-SNAPSHOT.jar"]