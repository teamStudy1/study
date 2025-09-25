package minyoung.subject;

public class MultiFunctionPrinter implements PrinterFuc {
    private int paper;

    public int getPaperSize() {
        return paper;
    }
    public void rechargePaper(int paper) {
        this.paper += paper;
    }


    @Override
    public void print(int amount) {
        if(paper >= amount) {
            this.paper -= amount;
        }else {
            System.out.println("용지 없음");
        }
    }
}
