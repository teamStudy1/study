package ggyun.ggyun.pr.com.chap_04;

/*
주차 요금은 20000 원입니다 일반차량 5시간
주차 요금은 10000원 입니다 경차 5시간
주차 요금은 15000원 입니다  장애인 차량 10시간

주차 요금 시간당 4000원 (일일 최대 3만원)
경차 또는 장애인 차량은 최종 요금에서 50% 할인
* */
public class _Quiz_04 {
    static void main(String[] args) {

      /*  int CarPrice = 4000; // 시간당 요금
        int OneMax = 30000; // 일일 최대 요금
        int hour = 0; // 시간
        int NomarCar = 0; // 일반차
        int MiddleCar = 0; // 경차
        int SpecialCar =0; // 장애인차량*/

        int hour = 5;
        boolean isSmallcar = false; // 경차여부
        boolean withDisablePerson = false; // 장애인 차량 여부

        int fee = hour * 4000; // 시간당 4000원 곱하기

        // 30000 원 초과 시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000; // 일일 최대 요금 적용
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallcar || withDisablePerson) {
            fee /= 2; // 50%할인 적용
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + "원 입니다");
    }
}
