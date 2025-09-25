package com.youable;

import com.youable.mfp.Printer;

import java.util.ArrayList;
import java.util.List;

public class PrinterPool {
    private List<Printer> printers =  new ArrayList<>();

    public void addMultiFunctionalPrinter(Printer printer) {
        printers.add(printer);
    }

    public Printer getAvailablePrinter() {
        for (Printer printer : printers) {
            if (!printer.isBusy()) {
                return printer;
            }
        }
        return null;
    }

    public int countPrinters() {
        return printers.size();
    }
}
