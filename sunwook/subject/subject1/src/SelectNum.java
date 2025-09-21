import java.util.Scanner;

public class SelectNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 리스트를 입력하세요 (예 :6, 9, 12) : ");

        String[] numbers = (scanner.nextLine()).replace(" ", "").split(",");
        int[] intNumber = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            intNumber[i] = Integer.parseInt(numbers[i]);
        }

        System.out.print("확인할 정수를 입력하세요 :");
        int checkNum = scanner.nextInt();

        solution(intNumber, checkNum);

        /*int[] result = new int[intNumber.length];
        int count = 0;

        for (int i = 0; i < intNumber.length; i++) {
            if (intNumber[i] % checkNum == 0) {
                result[count] = intNumber[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(result[i]);
            if (i != count - 1) {
                System.out.print(",");
            }
        }*/
    }

    public static void solution(int[] intNumber, int checkNum) {
        int[] result = new int[intNumber.length];
        int count = 0;

        for (int i = 0; i < intNumber.length; i++) {
            if (intNumber[i] % checkNum == 0) {
                result[count] = intNumber[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(result[i]);
            if (i != count - 1) {
                System.out.print(",");
            }
        }
    }
}
