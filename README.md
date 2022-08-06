# 기능 구현 목록

## 입력
- [ ] 사용자가 점에 대한 좌표 정보를 입력하는 메뉴를 구성한다.
  - [ ] 입력 안내 메시지 출력하기.
- [ ] 좌표 입력받기
  - [x] 좌표 입력 형식이 맞지 않으면 예외던지기.
  - [x] 입력 값의 띄어쓰기 없애기.
  - [x] 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
  - [ ] 좌표 입력 갯수 범위내에 들지 않으면 예외던지기.

## 출력
- [ ] 해당 좌표에 특수문자로 표시 (그래프)
- [ ] 직선인 경우는 두 점 사이 거리를 출력한다.

## 도메인
- [x] 선 길이 구하기
  - [x] 입력 받은 후 x, y 좌표 저장하기. (Line)
  - [x] x, y 좌표 모두 0이하 또는 25이상 숫자를 입력 시 예외던지기. (Point)
  - [x] 직선인 경우는 두 점 사이 거리를 계산한다



사용자가 점에 대한 좌표 정보를 입력하는 메뉴를 구성한다. ㅡ
좌표 정보는 괄호"(", ")"로 둘러쌓여 있으며 쉼표(,)로 x값과 y값을 구분한다. ㅡ
X, Y좌표 모두 최대 24까지만 입력할 수 있다. ㅡ
입력 범위를 초과할 경우 에러 문구를 출력하고 다시 입력을 받는다. ㅡ
정상적인 좌표값을 입력한 경우, 해당 좌표에 특수문자를 표시한다. ㅡ
좌표값과 좌표값 사이는 '-' 문자로 구분한다. ㅡ
직선인 경우는 두 점 사이 거리를 계산해서 출력한다. ㅡ