package ggyun.ggyun.pr.com.chap06;

public class _04_ParameterAndReturn {

    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number;
    }

    public static int getpowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;

        }
        return result;
    }

    static void main(String[] args) {
        // 전달값과 반환값이 있는 메소드
        int retVal = getPower(2);
        System.out.println(retVal);// 2 * 2 = 4;

        retVal = getPower(3);
        System.out.println(retVal); // 3 * 3= 9

        retVal = getpowerByExp(3,3); // 3 * 3 * 3 = 27
        System.out.println(retVal);

        System.out.println(getpowerByExp(2,4)); //2 * 2 * 2* 2 = 16
    }
}
