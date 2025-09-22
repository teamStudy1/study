import java.util.Scanner;

public class GrowthBacterial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int inputTime = sc.nextInt();;
        int result = solution(inputNumber, inputTime);
        System.out.println(result);
    }
    public static int solution(int n, int t) {
        double answer = n * Math.pow(2,t);
        return (int)answer;
    }
}
