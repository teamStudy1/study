package ggyun.ggyun.pr.com.chap_04;

public class _09_MultipleTable {
    static void main(String[] args) {
        // 구구단
        // 2 * 1 = 2
        // 2 * 2 = 4

        for (int i = 2; i <= 9 ; i++) {

            for (int j = 1; j <10; j++) {
                System.out.println(i + " * " + j + " = " + (i *j));

            }
            System.out.println();
        }
    }
}
