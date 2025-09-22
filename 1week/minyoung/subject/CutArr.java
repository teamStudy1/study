
import java.util.Arrays;
import java.util.Scanner;


public class CutArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputArr = sc.nextLine();
        String[] strArr = inputArr.substring(1, inputArr.length()-1)
                .replaceAll(" ", "")
                .split(",");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        int[] arr = new int[strArr.length];
        for(int i =0; i<arr.length; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }


        int[] result = solution(arr, num1, num2);
        for(int i : result){
            System.out.print(i + " ");
        }

    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
