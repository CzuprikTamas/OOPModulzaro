package bank;

public class BankAccount {

    private String accountName;
    private int balance;
    private final int accountNumber;
    private static int InValidAccountNumber;

    public BankAccount(String accountName, int balance, int accountNumber) {
        this.accountName = accountName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("A pénz a számláján: " + balance);
        }
    }

    public void withdraw(int amount) throws NotEnoughMoneyException {
        if (balance >= amount && amount > 0) {
            balance -= amount;
        } else {
            throw new NotEnoughMoneyException("Nincs elegendő pénz a bankba more..");
        }
    }

    public void transfer(BankAccount anotherAccount, int amount) throws NotEnoughMoneyException {
        if (balance >= amount) {
            balance -= amount;
            anotherAccount.balance += amount;
            //withdraw(amount);
            //anotherAccount.deposit(amount);
        }else {
            throw new NotEnoughMoneyException("Nincs pénz a kártyán.");
        }
    }

    public static void isValidAccountNumber() {

    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount[" +
                "accountName = " + accountName +
                ", balance = " + balance +
                ", accountNumber = " + accountNumber +
                ']';
    }
}
