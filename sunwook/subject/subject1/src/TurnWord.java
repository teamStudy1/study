import java.util.Scanner;

public class TurnWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("뒤집을 문자열을 1개 입력하세요: ");
        String word = scanner.nextLine();

        turnWord(word);
    }

    public static void turnWord(String word) {
        if (1 <= word.length() && word.length() <= 1000) {
            String reverse = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.substring(i, i + 1);
            }

            System.out.println("입력받은 문자열 " + word + "를 거꾸로 뒤집으면 " + reverse + "입니다.");
        } else {
            System.out.println("잘못된 길이의 문자열을 입력했습니다. 조건 확인 후 다시 입력 바랍니다.");
        }
    }
}



