FROM

MAINTAINER Michal Dec <michaldec@gmail.com>

ADD target/springboot_workshops-1.0-SNAPSHOT.jar /opt/application/application.jar

EXPOSE 8070:8070