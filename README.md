# msa.user-service

## 🧩 개요

- MSA 환경에서 **회원**기능을 제공하는 User Service API
- 🔗 [API Docs](https://msa-user-service.onrender.com/redoc.html)
- 🔗 [Swagger UI](https://msa-user-service.onrender.com/swagger-ui.html)

## 🛠 기술 스택

| 구분     | 사용 기술                  |
|--------|------------------------|
| 언어     | Kotlin                 |
| 프레임워크  | Spring Boot            |
| 빌드 도구  | Gradle                 |
| 데이터베이스 | MongoDB, PostgreSQL    |
| CI/CD  | GitHub Actions, Docker |
| 배포     | Render                 |

## 🌐 외부 서비스

| 항목         | 서비스명          | 설명                          |
|------------|---------------|-----------------------------|
| MongoDB    | MongoDB Atlas | 유저 데이터 저장 (NoSQL)           |
| PostgreSQL | Neon          | 좋아요 데이터 저장 (관계형)            |
| 코드 저장소     | GitHub        | 소스코드 관리 및 GitHub Actions 연동 |
| 컨테이너 레지스트리 | Docker Hub    | 빌드된 이미지 저장 및 배포에 사용         |
| 클라우드 호스팅   | Render        | Docker 이미지를 활용한 API 서버 배포   |

## 🚀 주요 기능

- User : 회원 등록 / 조회
- Wish : 상품 `좋아요(wish)` 등록 / 취소 / 조회

## 🔁 CI/CD 파이프라인

1. GitHub `main` 브랜치에 코드 push
2. GitHub Actions
   1. Gradle 빌드
   2. Docker 이미지 생성
   3. 생성된 이미지를 Docker Hub 에 푸시
3. Render 에서 변경된 이미지 배포