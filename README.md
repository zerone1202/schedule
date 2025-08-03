# ERD
<img width="249" height="144" alt="schedule ERD" src="https://github.com/user-attachments/assets/23521577-b4b1-4195-84f8-44ddb5b973f3" />


#



# API 명세서

기능 | 메서드 | URL       | 기능 설명             | 요청 예시       | 응답 예시       |
|---------|--------|------------------|------------------|-------------------|-------------------|
|일정 생성    | POST   | /schedule    | 새로운 일정을 작성합니다.     | {"title": string, "description": string, "author": string, "password": string}       | {"id": Long, "title": String, "description": String , "author": String, "createdAt": DateTime, "modifiedAt": DateTime}    |
|일정 전체 조회  | GET   | /schedule        |  작성자명을 기준으로 등록된 일정 목록을 전부 조회합니다.        | X       |  {"id": Long, "title": String, "description": String , "author": String, "createdAt": DateTime, "modifiedAt": DateTime}    |
|일정 단건 조회  | GET   | /schedule/{scheduleId} | 선택한 일정 단건의 정보를 조회합니다.      | X       |   {"id": Long, "title": String, "description": String , "author": String, "createdAt": DateTime, "modifiedAt": DateTime}    |
|일정 수정 | PUT    | /schedule/{scheduleId}   | 선택한 일정 내용 중 일정 제목, 작성자명을 수정합니다.      | {"title": string, "author": string, "password": string}     |  {"id": Long, "title": String, "description": String , "author": String, "createdAt": DateTime, "modifiedAt": DateTime}    |
|일정 삭제 | DELETE | /schedule/{scheduleId}   | 선택한 일정 삭제합니다.      |{"password": string}             | X   |
