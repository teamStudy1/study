import java.util.Scanner;

public class EvenSum {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int sum = 0;
        System.out.print("정수 한개를 입력하세요:");
        int num = scanner.nextInt();

        if (0 < num && num <= 1000) {
            for (int i = 1; i <= num; i++) {
                if(i%2==0){
                    sum+=i;
                }else {
                    continue;
                }
            }
        } else {
            System.out.println("잘못된 입력입니다. 0<입력 할 숫자 <= 1000 사이의 숫자를 입력하세요.");
        }

        System.out.println(num + "까지의 짝수의 합은 " + sum + "입니다.");
    }

}
