package com.youable;

import com.youable.mfp.*;

public class Application {
    public static void main(String[] args) {
        Company company = new Company(new PrinterPool());

        APrinter aPrinter = new APrinter("A모델 프린터");
        BPrinter bPrinter = new BPrinter("B모델 프린터");

        company.addMultiFunctionalPrinter(aPrinter);
        company.addMultiFunctionalPrinter(bPrinter);

        Employee employee = new Employee();
        employee.requestPrint(company.getPrinter());
        employee.fillPaper(Paper.create(), company.getPrinter());
        employee.requestPrint(company.getPrinter());

        Printer printer = company.getPrinter();
        if (printer instanceof Scannable) {
            employee.requestScan((Scannable) printer);
        } else if (printer instanceof Faxable) {
            employee.requestFax((Faxable) printer);
        }
    }
}
