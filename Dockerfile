FROM maven:3.5.3-alpine
WORKDIR /usr/src
COPY . .
RUN mvn clean install && mv ./target/votingapi-0.0.1-SNAPSHOT.jar votingapi-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "votingapi-0.0.1-SNAPSHOT.jar"]