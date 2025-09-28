package ggyun.ggyun.pr.misstion;

public class Basic5 {

    static int[] scores = {85, 90, 78, 92, 88};
    // 1. 점수배열을 '공유 변수'로 선언합니다
    // 이 변수는 이제 클래스 전체에서 사영 가능하다

    public static void main(String[] args) {
        // 메인 매서드는 별도의 매개변수 없이 계싼 메서드를 호출한다 .



        double average = calculateAverage();
        // calculLateAverage()를 호출할 때 괄호 안에 아무것도 넣지 안흔다 .

        System.out.println("점수 평균" + average);

    }
    public static double calculateAverage () {
        // 3. calculateAverage 메서드도 매개변수를 받지 않는다
        // 대신 , scores 변수에 직접 접근합니다.
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            // 매개변수 arr 대신 , static 변수인 scores를 사용 한다.
            sum += scores[i]; // sum = sum + scores[i];
        }
        return (double) sum / scores.length;
        // 이건 약속

    }

}

// main과 다른 문의 변수 값 공통 선언하기
// 출력 값에 따라서 왜 다른지 체크해보기
