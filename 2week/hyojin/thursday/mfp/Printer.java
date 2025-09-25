package com.youable.mfp;

import java.util.ArrayList;
import java.util.List;

/*
* 프린트를 하는 역활
* 종이 관리
* */
public abstract class Printer implements Printable {
    private String modelName;
    private List<Paper> papers = new ArrayList<>();
    private boolean isBusy = false;

    public Printer(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public boolean isBusy() {
        return isBusy;
    }

    @Override
    public void startPrint()  {
        if (papers.size() <= 0) {
            System.out.println("용지가 부족합니다");
            return;
        }

        this.isBusy = true;
        System.out.println("프린트를 출력합니다, 현재 용지 갯수 = " + countPapers());
        papers.remove(papers.size() - 1);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("프린트 출력에 실패했습니다");
        }
        this.isBusy = false;
        System.out.println("프린트 출력에 성공했습니다");
    }

    public int countPapers() {
        return papers.size();
    }

    public void addPaper(Paper paper) {
        papers.add(paper);
    }
}
