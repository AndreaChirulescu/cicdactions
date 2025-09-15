FROM openjdk:17-jdk-alpine

EXPOSE 8080
ADD target/cicddemo.jar cicddemo.jar
ENTRYPOINT ["java","-jar","/cicddemo.jar"]
