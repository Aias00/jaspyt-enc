FROM aias00/openjdk:8u361
ADD target/enc-web-client-1.0-SNAPSHOT.jar /opt
WORKDIR /opt/
EXPOSE 8080
ENTRYPOINT ["java","-jar","/opt/enc-web-client-1.0-SNAPSHOT.jar"]