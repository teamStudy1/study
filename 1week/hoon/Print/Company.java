package Print;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Company {
    private final String name;
    private final List<IPrinter> printers = new ArrayList<>();      //복합기 리스트 만들기.

    public Company(String name) { this.name = name; }

    public void install(IPrinter printer) {
        printers.add(printer);
        System.out.printf("[%s] 설치: %s%n", name, printer.getBrand());   //설치
    }

    public void remove(String brand) {
        printers.removeIf(p -> p.getBrand().equalsIgnoreCase(brand));
        System.out.printf("[%s] %s 복합기 제거%n", name, brand);         //제거
    }

    public List<IPrinter> getPrinters() {
        return Collections.unmodifiableList(printers);
    }

    public void show() {
        System.out.printf("[%s] 복합기 목록: %n", name);
        if (printers.isEmpty()) System.out.println("  없음");
        else printers.forEach(p -> System.out.println("  - " + p));     //설치된 복합기 목록 출력.
                                                                // 주소값 출력 해결 위해 Printer24~27 line에 toString 만듦.
    }
}

