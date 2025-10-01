package ggyun.ggyun.pr.com.chap01._Quiz_02;

// 주민등록번호에서 생년월일 및 성별까지만 출력하는
// 프로그램을 작성하시오
// 주민번호는 13자리 숫자로 구성
// 앞 6자리는 생년월일 정보, 뒷 7자리 중
// 첫 번쨰 숫자느 성별 정보
// 입력데이터는 -을 포함한 14자리의 문자열 형태
// 예시 - 901231-1234567 인경우 901231-1 까지 출력
// 030708-4567890 인경우 030708-4 까지 출력
public class _Quiz_03 {
    static void main(String[] args) {

        String id = "901231-1234567";
        id = "030708-4567890";
        System.out.println(id.substring(0, 8)); // 0위치부터 8위치 직전까지
//        String id2 = "030708-4567890";
        id = "030708-4567890";
        System.out.println(id.substring(0, id.indexOf("-") + 2)); // 0위치부터 하이픈 위치 + 2 직전까지

        }

    }
