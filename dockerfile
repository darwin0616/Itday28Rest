FROM openjdk:8
ADD sample4J-0.0.1-SNAPSHOT.jar itday28.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "itday28.jar"]
