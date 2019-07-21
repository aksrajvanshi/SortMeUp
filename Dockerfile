FROM frolvlad/alpine-java:jdk8-slim
VOLUME /tmp

ADD ./target/SortMeUp-0.0.1-SNAPSHOT.jar sortmeup.jar

RUN sh -c 'touch /sortmeup.jar'

ENTRYPOINT ["java","-jar","/sortmeup.jar"]
EXPOSE 8080