public class ATM {
    Double balance;
    public ATM() {
        balance = 20000.0;
    }
    public Double getBalance() {
        return balance;
    }

    public void depositCash(int amount) {
        balance += amount;
        System.out.println("Cash deposited: " + amount + "\n" + "Current balance: " + balance);

    }
    public void depositCheck(int amount,String checkNumber) {
        balance += amount;
        System.out.println("Check number: " + checkNumber + "\n" + "Current balance: " + balance);
    }
    public void depositMobileTransfer(String phoneNumber,double amount) {
        balance += amount;
        System.out.println("Mobile transfer: " + phoneNumber + "\n" + "Current balance: " + balance);
    }
}
