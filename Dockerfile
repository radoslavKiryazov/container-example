FROM openjdk:17-alpine
LABEL authors="rkiry"
EXPOSE 8088
#set a docker volume, if you want
VOLUME /backend_volume
#add the jar file
ADD /target/*.jar container-example-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar","container-example-0.0.1-SNAPSHOT.jar"]