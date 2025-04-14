# 경량 베이스 이미지
FROM eclipse-temurin:17-jdk-alpine

# 작업 디렉토리 설정
WORKDIR /app

# 빌드된 JAR만 복사
COPY build/libs/msa.user-service-0.0.1-SNAPSHOT.jar app.jar

# 포트 노출
EXPOSE 8080

# JAR 실행
ENTRYPOINT ["java", "-jar", "/app/app.jar"]