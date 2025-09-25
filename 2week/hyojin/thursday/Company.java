package com.youable;

import com.youable.mfp.Printer;

/*
* company는 프린터를 관리하는 역활을 담당
* 프린터를 추가할 수 있고 사용가능한 프린터를 제공한다
* */
public class Company {
    private final PrinterPool pool;

    Company(PrinterPool pool) {
        this.pool = pool;
    }

    public void addMultiFunctionalPrinter(Printer printer) {
        if (pool.countPrinters() >= 10) {
            System.out.println("프린터는 최대 10개만 설치할 수 있습니다.");
            return;
        }
        pool.addMultiFunctionalPrinter(printer);
    }

    public Printer getPrinter() {
        Printer printer = pool.getAvailablePrinter();
        if (printer == null) {
            throw new IllegalStateException("사용할 수 있는 프린터가 없습니다");
        }
        return printer;
    }
}
