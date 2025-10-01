package ggyun.ggyun.pr.com.chap01._Quiz_02;
/*
* - 키가 120 cm 이상인 경우에만 탑승 가능
* - 삼항 연산자 이용*/

// 키가 115cm 이므로 탑승 불가능합니다
// 키가 121cm 이므로 탑승 합니다.
public class _Quiz_02 {
    public static void main(String[] args) {
        int tall = 121;
        String result = (tall >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 " + tall + "cm 이므로 " + result);

/*        int Limit_tall = 121;

    int Tall = (tall < 120) ? tall : Limit_tall;
        System.out.println("키가" + tall + "cm 이므로 탑승 가능합니다");
        int Limit_tal = ();*/

    }
}
