FROM frolvlad/alpine-java:jdk8-slim
VOLUME /tmp

EXPOSE 8080
ARG JAR_FILE=target/SortMeUp-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","akspri/sortmeup"]