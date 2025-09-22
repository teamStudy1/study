public class Backteria {

    public static void main(String[] args) {
        int n = 2; // 처음 세균의 수
        int t = 10; // 경과 시간

        int result = solution(n, t);
        // solution 메서드를 호출하여 반환 된 값을 result 변수에 저장합니다

        System.out.println("처음 " + n + "마리가 " + t + "시간 후에 " + result + "마리가 됩니다 ");
    }
 
    public static int solution(int n, int t){
        // n과 t 두 개의 인자를 받는 solution 메서드
        // 초기 세균 수 n을 backte 변수에 저장합니다.
        int backte = n;

        for(int i = 0; i < t; i++ ) {
            // t 시간동안 세균이 2배씩 증식하는 과정 반복
            backte  *= 2;
            // backte = backte * 2;

        }
        return backte;
        // 최종 세균 수를 반환
    }
}

// 오타가 많이 남
// 코드를 한 번에 쓰는 실력이 부족
