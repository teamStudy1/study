package com.youable.mfp;

public class BPrinter extends Printer implements Faxable {
    public BPrinter(String modelName) {
        super(modelName);
    }

    @Override
    public void startFax() {
        System.out.println("팩스를 출력했습니다");
    }
}
