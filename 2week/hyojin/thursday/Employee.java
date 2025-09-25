package com.youable;

import com.youable.mfp.Faxable;
import com.youable.mfp.Paper;
import com.youable.mfp.Printer;
import com.youable.mfp.Scannable;

/*
* 프린터에서 프린트를 한다
* */
public class Employee {

    public void requestPrint(Printer printer) {
        printer.startPrint();
    }

    public void fillPaper(Paper paper, Printer printer) {
        printer.addPaper(paper);
    }

    public void requestScan(Scannable scannable) {
        scannable.startScan();
    }

    public void requestFax(Faxable faxable) {
        faxable.startFax();
    }
}