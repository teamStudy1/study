import java.util.Scanner;

public class DoubleMulti {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNum = 0;

        System.out.print("처음 세균의 마리수를 입력하세요: ");
        int virus = scanner.nextInt();

        System.out.print("경과 시간을 입력하세요: ");
        int runtime = scanner.nextInt();

        solution(virus, runtime);

    }


    public static void solution (int virus, int runtime) {
        int totalNum = 0;

        if ((1 <= virus && virus <= 10) && (1 <= runtime && runtime <= 15)) {
            totalNum = (int) (virus * Math.pow(2, runtime));
        } else {
            System.out.println("잘못된 입력입니다. 조건을 다시 확인 후 다시 입력하세요.");
        }

        System.out.println(runtime + "시간 후에 세균의 마리 수는 " + totalNum + "마리입니다.");
    }

}
