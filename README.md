Hello World sample shows how to deploy logHandler  application with [Docker](https://www.docker.com/)

#### Prerequisite

Installed:   
[Docker](https://www.docker.com/)   
[Docker-Compose](https://docs.docker.com/compose/install/)   
[Java 1.8](https://www.oracle.com/technetwork/java/javase/overview/index.html)   
[Maven 3.x](https://maven.apache.org/install.html)

#### Steps

##### Build Maven project
```
$ mvn clean install .
```

## Run with docker-compose 

Build and start the container by running 

```
$ docker-compose up
```

##### Stop Docker Container:
```
$ docker-compose down
```



Run without container

```
$ mvn -q clean compile exec:java -Dexec.mainClass="Tool.logHandler.App" -Dexec.args="asasas console error"
```

