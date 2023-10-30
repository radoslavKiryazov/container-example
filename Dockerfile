FROM maven:3.9.4-eclipse-temurin-17-alpine as build
RUN -mkidir -p /app
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -b package --file pom.xml -Dskiptests


FROM eclipse-temurin:17-alpine
EXPOSE 8088
COPY --from=build /app/target/*.jar container-example-0.0.1-SNAPSHOT.jar
LABEL authors="rkiry"
ENTRYPOINT ["java", "-jar","container-example-0.0.1-SNAPSHOT.jar"]