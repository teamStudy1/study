package minyoung.subject;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        SamsungMFP samsung = new SamsungMFP();
        CanonMFP canon = new CanonMFP();


        Company company = new Company();
        company.setPrinters(samsung);
        company.setPrinters(canon);

        samsung.rechargePaper(100);
        samsung.print(80);

        samsung.fax();
        samsung.print(1);

        int size = samsung.getPaperSize();
        System.out.println(size);
    }
}
