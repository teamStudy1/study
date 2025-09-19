2025/09/18 목요일

블로그 작성하는게 좋다.

블로그 글의 제목은 주제가 뭔지 알 수 있게 명확히 작성한다.

시각화 할 수 있는 사진 자료도 있으면 좋다.

구체적인 예시를 찾아서 기재하는 방법도 좋다.

java는 패키지 위치를 꼭 잘 확인하자.

java에서 만들어논 class를 사용하려면 ex> Scanner

import 해줘야 한다 클래스 밖에

nextInt 사용 후 뒤에 nextLine()이 나오면 Int는 \n을
가지고 있기 때문에 nextLine()을 한번 더 쳐서 \n을 받아준다.

아마 Line() 빼고 다 그럴 것이다.

java 스택 구조는 LIFO구조를 가진다.

참조 자료형은 주소값을 비교한다.

# Java 메모리 구조 정리 - 기본형 vs 참조형

Java의 메모리 구조는 크게 **기본형(Primitive Type)**과
**참조형(Reference Type)**으로 나뉩니다. 
이 두 가지 타입은 메모리에 저장되는 방식이 다르며, 
성능과 메모리 관리에도 영향을 줍니다.

---

## 기본형 (Primitive Type)

- `int`, `float`, `char`, `boolean` 등.
- **값 자체가 스택(Stack)**에 저장된다.
- 메서드 종료 시 자동 제거 (GC 대상 아님).
- 접근 속도 빠르고 메모리 효율적임.

String Pool의 문자열은 불변(Immutable) → 값 변경 시 새로운 객체 생성

# Java의 데이터 타입 심화: 부동소수점과 정밀도
Java에서 float과 double은 IEEE 754 부동소수점 표준을 따릅니다. 
이 표준은 실수를 이진수로 표현하기 위한 규칙이며, 
정밀도 문제와 오차가 발생하는 근본적인 이유이기도 합니다.



float: 32비트 (1비트 부호, 8비트 지수, 23비트 가수)

double: 64비트 (1비트 부호, 11비트 지수, 52비트 가수)

이진수 표현의 한계
10진수 소수(예: 0.1)는 이진수로 정확히 표현할 수 없음 → 무한소수로 반복됨
예: 0.1(10진수) → 0.0001100110011...(2진수 반복)

컴퓨터는 이를 근사값으로 저장 → 정밀도 손실 발생

부동소수점 연산 오차
0.1 + 0.2 결과는 0.3이 아닌 0.30000000000000004

이유: 반올림 오차와 정밀도 부족


실무에서의 권장 사항
실수 비교 시 == 사용 ❌


정밀도가 중요한 계산에는 BigDecimal 사용:

import java.math.BigDecimal;

BigDecimal a = new BigDecimal("0.1");
BigDecimal b = new BigDecimal("0.2");
BigDecimal result = a.add(b);
System.out.println(result); // 정확히 0.3






# Java의 데이터 타입 심화: 부동소수점과 정밀도

Java에서 `float`과 `double`은 **IEEE 754 부동소수점 표준**을 따릅니다. 이 표준은 실수를 이진수로 표현하기 위한 규칙이며, 정밀도 문제와 오차가 발생하는 근본적인 이유이기도 합니다.

---

## 🔹 부동소수점(Floating-Point)의 구조

| 구성 요소 | 역할                             |
|-----------|----------------------------------|
| 부호(Sign bit) | 숫자의 양/음 여부 (0: 양수, 1: 음수) |
| 지수(Exponent) | 수의 크기(스케일)를 결정              |
| 가수(Mantissa) | 실제 유효 숫자 값                  |

- `float`: 32비트 (1비트 부호, 8비트 지수, 23비트 가수)
- `double`: 64비트 (1비트 부호, 11비트 지수, 52비트 가수)

---

## 🔹 이진수 표현의 한계

- 10진수 소수(예: 0.1)는 이진수로 **정확히 표현할 수 없음** → 무한소수로 반복됨  
  예: `0.1(10진수)` → `0.0001100110011...(2진수 반복)`

- 컴퓨터는 이를 **근사값**으로 저장 → 정밀도 손실 발생

---

## 🔹 부동소수점 연산 오차

- `0.1 + 0.2` 결과는 `0.3`이 아닌 `0.30000000000000004`
- 이유: **반올림 오차**와 **정밀도 부족**

📌 예제 코드:
```java
public class Main {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        System.out.println(a + b); // 0.30000000000000004
    }
}
🔹 실무에서의 권장 사항
실수 비교 시 == 사용 ❌

오차 허용 범위 내에서 비교 ✅

java
코드 복사
if (Math.abs(a - b) < 0.0001) {
    // 두 수는 사실상 같다
}
정밀도가 중요한 계산에는 BigDecimal 사용:

java
코드 복사
import java.math.BigDecimal;

BigDecimal a = new BigDecimal("0.1");
BigDecimal b = new BigDecimal("0.2");
BigDecimal result = a.add(b);
System.out.println(result); // 정확히 0.3