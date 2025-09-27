package Print;

// 프린터 인터페이스

interface IPrinter {
    void print(int pages);
    void scan(String doc);
    void fax(String number, String doc);
    String getBrand();
}
