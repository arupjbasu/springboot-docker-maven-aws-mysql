FROM openjdk:8
EXPOSE 8080
ADD target/springboot-docker-maven.jar springboot-docker-maven.jar
ENTRYPOINT ["java","-jar","/springboot-docker-maven.jar"]
