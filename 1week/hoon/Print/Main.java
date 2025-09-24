package Print;

public class Main {
    public static void main(String[] args) {
        Company c = new Company("Wanted");              //회사명 입력
        c.install(new Printer("Canon", 10));      //설치 희망하는 복합기의 브랜드 입력
        c.install(new Printer("Xerox", 5));       //복수개의 복합기시 다음에 입력
        c.show();                                           // 어떤 회사에 어떤 복합기가 설치되어 있는지 보여줌.

        User u = new User("Hoon", c);               //유저가 회사에 있는 복합기 사용
        u.print(0, 5);
        u.print(1, 10);
        u.scan(0, "계약서.pdf");
        u.fax(0, "02-111-2222", "계약서.pdf");

        c.remove("Xerox");                      //제거 하고싶은 복합기 입력
        c.show();                                       //설치 -> 제거 후 현재 회사에 남아있는 복합기 출력
    }
}