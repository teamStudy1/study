package com.youable.mfp;

public class APrinter extends Printer implements Scannable {
    public APrinter(String modelName) {
        super(modelName);
    }

    @Override
    public void startScan() {
        System.out.println("스캔을 완료했습니다");
    }
}
