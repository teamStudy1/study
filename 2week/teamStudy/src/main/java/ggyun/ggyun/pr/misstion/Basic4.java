package ggyun.ggyun.pr.misstion;

public class Basic4 {

    public static void main(String[] args) {

        int[] scores = {85, 90, 78, 92, 88};

        double average = calculateAverage(scores);

        System.out.println("평균" + average);

    }
    public static double calculateAverage (int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // sum = sum + scores[i];
        }
        return (double) sum / arr.length;
        // 이건 약속

    }

}

// main과 다른 문의 변수 값 공통 선언하기
// 출력 값에 따라서 왜 다른지 체크해보기
