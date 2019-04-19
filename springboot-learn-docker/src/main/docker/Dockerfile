FROM centos:7

MAINTAINER chenyuan <chengcheng222e@sina.com>

CMD "echo" "Hello chengcheng222e!"

VOLUME /tmp

ADD springboot-learn-docker-1.0-SNAPSHOT.jar app.jar

RUN sh -c 'touch /app.jar'

EXPOSE 8080

ENV JAVA_OPTS=""

CMD ["java" , "-Xmx1024m","-XX:MaxPermSize=128M","-jar", "app.jar"]