# 기능 구현 목록

## 입력
- [x] 선길이 구하기
  - [x] 사용자가 점에 대한 좌표 정보를 입력하는 메뉴를 구성한다.
    - [x] 입력 안내 메시지 출력하기.
  - [x] 좌표 입력받기
    - [x] 좌표 입력 형식이 맞지 않으면 예외던지기.
    - [x] 입력 값의 띄어쓰기 없애기.
    - [x] 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
    - [x] 객체 생성해서 반환하기.
    - [x] 좌표 입력 갯수 범위내에 들지 않으면 예외던지기.
- [x] 사각형 넓이 구하기
  - [x] 좌표값과 좌표값 사이는 '-' 문자로 구분

## 출력
- [x] 선길이 구하기
  - [x] 해당 좌표에 특수문자로 표시 (그래프)
  - [x] 직선인 경우는 두 점 사이 거리를 출력
- [x] 사각형 넓이 구하기
  - [x] 해당 좌표에 특수문자로 표시 (그래프)
  - [x] 사각형인 경우 사각형의 넓이를 출력
- [ ] 삼각형 넓이 구하기
  - [ ] 삼각형인 경우 삼각형의 넓이를 출력

## 도메인
- [x] 선 길이 구하기
  - [x] 입력 받은 후 x, y 좌표 저장하기. (Line)
  - [x] x, y 좌표 모두 0이하 또는 25이상 숫자를 입력 시 예외던지기. (Point)
  - [x] 직선인 경우는 두 점 사이 거리를 계산한다
- [x] 사각형 넓이 구하기
  - [x] 좌표값을 두 개 입력한 경우, 두 점을 있는 직선으로 가정
  - [x] 좌표값을 네 개 입력한 경우, 네 점을 연결하는 사각형으로 가정
  - [x] 네 점이 뒤틀어진 사다리꼴이나 마름모는 제외하고 직사각형만 허용하도록 검사
    - [x] x와 y의 숫자 각각 중복을 걸러내면 두개의 숫자만 존재
  - [x] 사각형 넓이 구하기
- [ ] 삼각형 넓이 구하기
  - [x] 좌표값을 3개 입력한 경우, 세 접을 연결하는 삼각형으로 가정
  - [x] 삼각형 형태가 맞지 않으면 예외 던지기
  - [ ] 삼각형 넓이 구하기



좌표값을 세 개 입력한 경우, 세 점을 연결하는 삼각형으로 가정한다. ㅡ
삼각형인 경우 삼각형의 넓이를 계산해서 출력한다. ㅡ