FROM openjdk:17-slim

WORKDIR /app

COPY out/artifacts/spring_jenkins_jar/spring-jenkins.jar /app/spring-jenkins.jar

CMD ["java","-jar","spring-jenkins.jar"]

EXPOSE 8080