import java.util.Scanner;

public class Taller {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("반 친구들의 키를 입력하세요 (예 : 149, 180, 192, 170) : ");
        String[] arrays = scanner.nextLine().replace(" ", "").split(",");
        double[] array = new double[arrays.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(arrays[i]);
        }

        System.out.print("본인의 키를 입력하세요: ");
        double height = scanner.nextDouble();

        solution(array, height);


    }

    public static void solution(double[] array, double height) {
        int count = 0;
        if (1 <= height && height <= 200) {
            for (int i = 0; i < array.length; i++) {
                if (height < array[i]) {
                    count++;
                }
            }
        } else {
            System.out.println("이 시스템은 1cm~200cm까지의 입력만 비교 가능합니다.");
        }
        System.out.println("본인보다 더 큰 사람의 수는 " + count + "명입니다.");
    }
}
