package Print;

import java.util.*;

//복합기 3기능 + 용지

class Printer implements IPrinter {
    private final String brand;
    private int paper;

    // 남아있는 용지 수 건들 x

    public Printer(String brand, int paper) {
        this.brand = brand;
        this.paper = Math.max(0, paper); // 용지수 음수로 입력받아도, 0. (A 0>음수)
    }
    // 생성자 사용

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return brand;
    }

    public void refill(int pages) {
        if (pages > 0) {
            paper += pages;
            System.out.printf("[%s] 용지 충전 +%d (현재:%d)%n", brand, pages, paper);
        }
    }

    @Override
    public void print(int pages) {
        if (pages <= 0) return;
        if (paper < pages) {
            System.out.printf("[%s] 용지 부족 (현재:%d, 필요:%d) 용지를 충전해야 함.%n", brand, paper, pages);
        } else {
            paper -= pages;
            System.out.printf("[%s] %d페이지 인쇄 완료 (남은:%d)%n", brand, pages, paper);
        }
    }
    //프린트시 작동 메커니즘

    @Override
    public void scan(String doc) {
    }

    @Override
    public void fax(String number, String doc) {
    }
}


