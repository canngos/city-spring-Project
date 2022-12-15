FROM openjdk:17-jdk-alpine
COPY build/libs/city-spring-0.0.1-SNAPSHOT.jar city-spring-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/city-spring-0.0.1-SNAPSHOT.jar"]