package Print;

class User {
    private final String name;
    public static Company company;

    public User(String name, Company company) {
        this.name = name; User.company = company;
    }
    //이름 및 회사명 입력 필드, 객체 저장

    private IPrinter select(int idx) {
        var list = company.getPrinters();
        return (idx < 0 || idx >= list.size()) ? null : list.get(idx);
    }

    //사용할 프린터 선택 메소드

    public void print(int idx, int pages) {
        var p = select(idx);
        if (p != null) p.print(pages);
    }

    // 예외방지를 포함한 프린트기능

    public void scan(int idx, String doc) {
        var p = select(idx);
        if (p != null) p.scan(doc);
    }

    // 스캔기능

    public void fax(int idx, String num, String doc) {
        var p = select(idx);
        if (p != null) p.fax(num, doc);
    }
    // 팩스기능

    public String getName() {
        return name;

        //사용자 이름 반환하는 게터 메소드
    }
}
