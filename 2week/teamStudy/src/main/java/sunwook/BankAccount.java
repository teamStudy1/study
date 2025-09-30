package sunwook;

public class BankAccount {

    private String accountNumber;
    private String accountOwner;
    private int balance;

    public BankAccount(String accountNumber, String accountOwner, int balance) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("최소 잔액은 0원 이상이여야 합니다.");
        }
    }

    public void inMoney(int money) {
        if (money >= 0) {
            this.balance += money;
            System.out.println(money + "원 입금 완료했습니다. 현재 잔액은 " + balance + "원 입니다.");
        } else {
            System.out.println("최소 입금 금액은 0원 이상이여야 합니다.");
        }
    }

    public void outMoney(int money) {
        if (money > 0 && balance >= money) {
            this.balance -= money;
            System.out.println(money + "원 출금 완료했습니다. 현재 잔액은 " + money + "원입니다.");
        } else {
            System.out.println("출금할 금액보다 계좌에 돈이 부족합니다. 계좌 확인 후 다시 시도하세요.");
        }
    }

    public void accountInformation() {
        System.out.println("계좌 번호: " + this.accountNumber);
        System.out.println("소유주 명: " + this.accountOwner);
        System.out.println("현재 잔액: " + this.balance);
    }
}
