# city-spring-Project

BUILD PROJECT:  ./gradlew clean build (RUN SPOTLESS BEFORE BUILD PROJECT)

RUN SPOTLESS: gradle spotlessApply 

SONARQUBE: gradle sonarqube

UNIT TESTS: ./gradlew clean test

RUN JAR PACKAGE: java -jar build/libs/city-spring-0.0.1-SNAPSHOT.jar -p 8564

DOCKER BUILD: docker build . -t city-service:latest  

DOCKER RUN: docker-compose up -d
