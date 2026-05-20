#Build stage
FROM maven:3.9.6-eclipse-temurin-17 AS builder

WORKDIR /app
COPY pom.xml ./
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package -DskipTests

#Runtime
FROM tomcat:9.0-jdk17-temurin AS runtime

WORKDIR /usr/local/tomcat/webapps/
COPY --from=builder /app/target/*.war ROOT.war
CMD ["catalina.sh", "run"]
