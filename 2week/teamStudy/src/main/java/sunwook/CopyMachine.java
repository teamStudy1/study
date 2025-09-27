package sunwook;

public class CopyMachine {
    private String brand;
    private int paper;


    public CopyMachine(String brand, int paper) {
        this.brand = brand;
        System.out.println("제품명 : " + this.brand);
        if (paper > 0) {
            this.paper = paper;
        } else {
            this.paper = 0;
        }
    }

    public int getPaper() {
        return paper;
    }

    public void setPaper(int paper) {
        this.paper = paper;
    }

    public void refillPaper(int paper) {
        if (paper > 0) {
            this.paper += paper;
            System.out.println("종이 충전 완료. 현재 종이 수량은 " + this.paper + "장입니다.");
        } else {
            System.out.println("종이 충전은 최소 1장 이상입니다.");
        }
    }

    public void print(int paper) {
        if (paper > 0) {
            this.paper -= paper;
            System.out.println("출력 완료 했습니다.");
            System.out.println("현재 남은 종이 수량은" + paper + "장입니다.");
        } else {
            this.paper = 0;
            System.out.println("종이가 부족합니다. 확인 후 충전 해주세요.");
        }
    }

    public void scan() {
        System.out.println("스캔 완료");
    }

    public void fax() {
        System.out.println("팩스 보내기 완료");
    }

    class Company{
        private String brand;
        private int paper;

        public Company(String brand) {
            this.brand = brand;
        }
        public void addCopyMachine(){
            System.out.println();
        }
    }
}
