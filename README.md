API 명세서

1. 일정 생성
POST /schedules (새로운 일정을 등록합니다.)

Request Body
{
  "title": "프로젝트",
  "description": "일정 관리 앱 프로젝트",
  "author": "박소영",
  "password": "1234"
} 

Rsponse Body
{
    "id": 1,
    "title": "프로젝트",
    "description": "일정 관리 앱 프로젝트",
    "author": "박소영",
    "createdAt": "2025-08-04T01:42:14.47448",
    "modifiedAt": "2025-08-04T01:42:14.47448"
}    

  
2. 일정 조회
  - 전체 일정 조회
GET /schedules (모든 일정을 조회합니다.)
  - 단일 일정 조회
GET /schedules/{scheduleId} (특정 일정 하나를 조회합니다.)


3. 일정 수정
  - PUT /schedules/{scheduleId} (일정 제목과 작성자명을 수정합니다.)


4. 일정 삭제
  - DELETE /schedules/{scheduleId} (해당 일정을 삭제합니다.)
