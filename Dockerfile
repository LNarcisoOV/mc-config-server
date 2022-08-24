FROM openjdk:17-oracle
EXPOSE 8078
ADD /target/mc-config-server-0.0.1-SNAPSHOT.jar mc-config-server.jar
ENTRYPOINT ["java", "-jar", "mc-config-server.jar"]
