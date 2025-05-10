FROM openjdk:17-slim

WORKDIR /app

COPY out/artifacts/spring_jenkins_jar/spring-jenkins.jar /app/app.jar

CMD ["java","-jar","app.jar"]

EXPOSE 8080