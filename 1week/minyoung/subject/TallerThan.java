import java.util.Scanner;

public class TallerThan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputArr = sc.nextLine();
        int inputHeight = sc.nextInt();
        String[] strArr = inputArr.substring(1, inputArr.length() - 1)
                .replaceAll(" ", "")
                .split(",");


        int[] arr = new int[strArr.length];

        for(int i= 0; i<strArr.length; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int result = solution(arr, inputHeight);
        System.out.println(result);

    }

    public static int solution(int[] array, int height) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            if(height < array[i]) answer++;
        }
        return answer;
    }
}

