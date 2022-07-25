# 기능 구현 목록

## 입력
- [ ] 점에 대한 좌표를 입력
  - [ ] 사용자가 점에 대한 좌표 정보를 입력하는 메뉴를 구성

## 출력
- [ ] 좌표 입력 시, 점 위치 특수문자로 표시
- [ ] 두 점 사이 거리 출력

## 도메인
- [x] 입력 처리
  - [x] x, y 좌표 모두 최대 24까지만 허용
      - [x] 입력 범위 초과 시, 에러 문구 출력 후 다시 입력
  - [x] 구분자로 좌표 값을 나눠서 저장
    - [x] 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
    - [x] 좌표 정보는 괄호"(", ")"로 둘러쌓여 있다
    - [x] 쉼표(,)로 x값과 y값을 구분
- [x] 두 점 사이 거리를 계산 후 반환

기능 요구사항

사용자가 점에 대한 좌표 정보를 입력하는 메뉴를 구성한다. ㅡ
좌표 정보는 괄호"(", ")"로 둘러쌓여 있으며 쉼표(,)로 x값과 y값을 구분한다. ㅡ
X, Y좌표 모두 최대 24까지만 입력할 수 있다. ㅡ
입력 범위를 초과할 경우 에러 문구를 출력하고 다시 입력을 받는다. ㅡ
정상적인 좌표값을 입력한 경우, 해당 좌표에 특수문자를 표시한다. ㅡ
좌표값을 두 개 입력한 경우, 두 점을 있는 직선으로 가정한다. ㅡ
좌표값과 좌표값 사이는 '-' 문자로 구분한다. ㅡ
직선인 경우는 두 점 사이 거리를 계산해서 출력한다. ㅡ



실행 결과

좌표를 입력하세요.
(10,10)-(14,15)

두 점 사이 거리는 6.403124



힌트

두 점 사이 거리는 제곱근((A.x - B.x)^제곱 + (A.y - B.y)^제곱) 공식으로 계산할 수 있다.
제곱근을 구하는 수학 함수는 Math.sqrt()를 활용한다.
테스트 코드의 경우 double일 때 근사치를 테스트하는 경우가 많다.

테스트 assert 힌트

junit은 assertEquals(1.414, line.length(), 0.001);과 같이 세번째 인자에 정밀도를 지정할 수 있다.
assertj는 assertThat(line.length()).isEqualTo(1.414, offset(0.00099));과 같이 offset 메소드로 정밀도를 지정할 수 있다.