# msa.user-service

## 🧩 개요
- MSA 환경에서 **회원/인증 관련 기능**을 제공하는 User Service API
- 🔗 [서비스 링크 바로가기](https://msa-user-service.onrender.com)

## 🛠 기술 스택

| 구분       | 사용 기술             |
|------------|------------------------|
| 언어       | Kotlin                 |
| 프레임워크 | Spring Boot            |
| 빌드 도구  | Gradle                 |
| 데이터베이스 | MongoDB, PostgreSQL    |
| CI/CD      | GitHub, Docker, Render |

## 🌐 외부 서비스

| 항목           | 서비스명           | 설명                         |
|----------------|--------------------|------------------------------|
| MongoDB        | MongoDB Atlas      | 유저 데이터 저장 (NoSQL)     |
| PostgreSQL     | Neon               | 좋아요 데이터 저장 (관계형)  |
| 저장소         | GitHub             | 코드 관리 및 CI 연결         |
| 클라우드 호스팅 | Render             | Docker 기반 API 서버 배포      |

## 🚀 주요 기능
- 회원 가입 / 로그인
- 사용자 프로필 조회 / 수정
- 상품 `좋아요(wish)` 등록 / 취소
- 좋아요 목록 조회