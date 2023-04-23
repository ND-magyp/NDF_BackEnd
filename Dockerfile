
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

#FROM alpine:latest

#CMD ["/bin/sh"]


FROM amazoncorretto:17-alpine-jdk

MAINTAINER NormaDF

COPY target/ndf-0.0.1-SNAPSHOT.jar ndf-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/ndf-0.0.1-SNAPSHOT.jar"]

