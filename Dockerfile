FROM openjdk:11
ADD target/springboot-webapp.jar springboot-webapp.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "springboot-webapp.jar"]