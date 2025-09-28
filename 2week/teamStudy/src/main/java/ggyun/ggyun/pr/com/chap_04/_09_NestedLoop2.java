package ggyun.ggyun.pr.com.chap_04;

public class _09_NestedLoop2 {
    static void main(String[] args) {
        // 이중 반복문

        // 별 (*)

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}