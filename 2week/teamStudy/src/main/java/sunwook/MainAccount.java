package sunwook;

public class MainAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1002-958-867257", "김선욱", 10000);

        bankAccount.accountInformation();
        System.out.println();

        bankAccount.inMoney(40000);
        bankAccount.inMoney(50000);

        bankAccount.outMoney(70000);
        System.out.println();

        bankAccount.outMoney(40000);

        System.out.println();
        bankAccount.accountInformation();
    }
}
