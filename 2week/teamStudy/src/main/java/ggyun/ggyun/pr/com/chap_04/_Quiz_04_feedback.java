package ggyun.ggyun.pr.com.chap_04;


/* 일반차랑 5시간 주차 시 2만원
   경차 5시간 주차시 1만원
   장애인 차량 10시간 주차 시 15000원
 */
public class _Quiz_04_feedback {
    static void main(String[] args) {

        int hour = 10; // 주차 시간
        boolean isSmallCar = false; // 경차 차량 여부
        boolean SpecialCar = true; // 장애인 차량 여부

        int Total = hour * 4000; // 주차 정산 요금 (시간당 4000원 곰밯기)

        // 30000어원 초과 시 일일 최대 요금으로 수정

        if (Total > 30000) {
            Total = 30000; // 일일 최대 요금 적용
        }

        // 경차 또는 장애인 차량일 경우 50% 할인
        if (isSmallCar || SpecialCar) {
            Total /= 2; // 50프로 할인 적용
        }
        System.out.println("주차 요금은 " + Total + "원 입니다");
    }
}

