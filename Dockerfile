FROM frolvlad/alpine-java:jdk8-slim
VOLUME /tmp

EXPOSE 8080

ADD ./target/SortMeUp-0.0.1-SNAPSHOT.jar myapp.jar

RUN sh -c 'touch /myapp.jar'

ENTRYPOINT ["java","-jar","/myapp.jar"]
EXPOSE 8080