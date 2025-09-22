import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int result = solution(input);
        System.out.println(result);

    }

    public static int solution(int n) {
        int answer = 0;
        for(int i=0; i<=n; i++){
            if(i%2==0) answer +=i;
        }
        return answer;
    }
}

