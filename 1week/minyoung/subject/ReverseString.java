import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = solution(input);
        System.out.println(result);
    }

    public static String solution(String my_string) {
        StringBuffer sb = new StringBuffer(my_string);
        return sb.reverse().toString();
    }
}
