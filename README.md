<📁 Lv1: 단일 파일 기반 기본 계산기>
📌 기능 설명
사용자로부터 두 정수와 연산자를 입력받아 사칙연산(+, -, *, /)을 수행합니다.

입력과 계산 로직이 모두 하나의 파일(CalculatorProject1.java)에 포함되어 있습니다.

🧱 코드 구조
CalculatorProject1.java: main() 메서드와 계산 로직이 함께 있는 단일 클래스 파일입니다.
- 사용자 입력 처리
- 사칙연산 로직 수행
- 결과 출력

<📁 Lv2 - 결과 저장 기능 추가>
📌 기능 설명
- Lv1 기능에 더해 계산 결과를 Queue에 저장합니다. (Queue 선입선출)
- null 반환을 방지하기 위해 Optional 클래스를 도입하였습니다.
- 사용자 명령어 입력을 통해 계산 기능뿐만 아니라 결과 리스트를 확인하고 삭제할 수 있습니다.

💻 지원 명령어
go : 계산기 실행
exit : 프로그램 종료
list : 저장된 결과 목록 출력
delete : 가장 오래된 결과 삭제

🧱 코드 구조
Main.java
- 사용자 입력 및 명령어 처리
- 예외 상황에 대한 기본 처리 (InputMismatchException, ArithmeticException)

Calculator.java
- 사칙연산 처리
- 계산 결과를 Queue에 저장
- 결과 조회 및 삭제 기능 포함

<📁 Lv3 - 예외 처리 및 코드 안정성 개선>
📌 기능 설명
- Lv2의 기능에 더해 예외 처리 및 코드의 안정성을 강화하였습니다.
- null 반환을 방지하기 위해 Optional 클래스를 도입하였습니다.
- 연산자 검증, 나눗셈 예외, 잘못된 입력 등에 대해 안정적인 처리를 구현했습니다.
- 

🧱 코드 구조
Main.java
- 사용자 입력 처리 강화

- 람다 & 스트림을 사용하여 저장된 연산 결과 리스트에서 특정 값보다 큰 값만 필터링해서 조회할 수 있도록 했습니다.
- 또한 스트림 API를 이용해서 가독성을 높이고 선언형 방식으로 구현했습니다.
- 기존 for문 방식보다 코드가 간결하고 직관적이라는 장점이 있습니다.

- 제네릭 - ArithmeticCalculator<T> 사용으로 기존 정수형 int만 다루던 계산기를 Double, Integer, Float 등 다양한 숫자 타입으로 확장했습니다. T는 무조건 숫자 타입만 가능하게 하였습니다.
- 또한 int와 double을 하나의 클래스에서 재사용 가능하게 할 수 있으며 코드 중복 제거를 할 수 있습니다.

- Enum-OperatorType 사용으로 문자 연산자를 코드 내에서 안전하고 명확하게 다루기 위해 사용하였으며 switch(operator)처럼 연산자를 기준으로 조건 분기 시 가독성과 안정성을 확보하였습니다.

Calculator.java
- 사칙연산 수행
- Queue에 결과 저장
- Optional<Integer>을 통해 안전하게 결과 제거
