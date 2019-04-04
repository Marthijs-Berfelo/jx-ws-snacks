FROM openjdk:11-jre-slim
MAINTAINER Marthijs Berfelo <marthijs.berfelo@hybrit.org>
EXPOSE 8080

COPY ./build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]