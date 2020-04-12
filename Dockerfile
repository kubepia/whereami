FROM maven:3-jdk-8 as builder

RUN mkdir /project

COPY ./ /project

WORKDIR /project
RUN mvn -Dskiptest package


FROM openjdk:8-jdk-alpine


COPY  --from=builder /project/target/*.jar app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=prd","-jar","/app.jar"]