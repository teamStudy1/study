package ggyun.ggyun.pr.misstion;

public class Basic3 {

   public static void main(String[] args) {

        int sum = 0;

        for (int i=0; i<=100; i++){

            if (i%2==0) {
                sum += i; // 짝수일 때만 더함
            }

        }
       System.out.println("부터 100까지 짝수 합은" + sum + "입니다");

    }
}
