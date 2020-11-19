FROM java:8
COPY ./target/*.jar /app/logHandler-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/app/logHandler-0.0.1-SNAPSHOT.jar"]