FROM maven:3.9.4-eclipse-temurin-17-alpine as build
RUN mkdir -p /app
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -B package --file pom.xml -Dskiptests


FROM eclipse-temurin:17-alpine
EXPOSE 8088
COPY --from=build /app/target/*.jar container-example-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","container-example-0.0.1-SNAPSHOT.jar"]