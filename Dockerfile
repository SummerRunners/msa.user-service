FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY . .

RUN chmod +x ./gradlew && ./gradlew build

EXPOSE 8080

CMD ["java", "-jar", "build/libs/msa.user-service-0.0.1-SNAPSHOT.jar"]