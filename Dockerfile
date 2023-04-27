FROM amazoncorretto:17-alpine-jdk

MAINTAINER Norma

COPY target/piloto-0.0.1-SNAPSHOT.jar piloto-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/piloto-0.0.1-SNAPSHOT.jar"]