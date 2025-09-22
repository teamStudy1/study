 public class Sum {
        public static void main(String[] args) {

            int n = 10;
            // n이라는 정수형 변수에 상한 값을 10으로 설정

            int result = solution(n);
            // sol 객체를 통해 solution 매서드를 호출하고
            // n값을 매개변수로 전달하여 반환 값을 result에 저장

            System.out.println("n이 " + n + "이므로 " + "짝수의 합은 " + result + "입니다 ");
        } // 띄어쓰기를 하여 가독성 증가
        public static int solution(int n) {
            int sum = 0;
            // 합을 저장할 변수를 0으로 초기화 합니다


            for (int i=2 ; i <= n ; i += 2) {
                // i = 2  ; 2가 n보다 작거나 같으면 true
                // true 일때 본문을 실행
                sum += i;
                // sum = sum+i
                // sum = 0+ 2

                // i = 2 / 2 <= n / sum = 0+2 / i=4
                // 4 <= n / sum = 2+4=6 / i=6
            }
            return sum; // 최종 합계 반환
        }
    }
    
