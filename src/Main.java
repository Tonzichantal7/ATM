//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.depositCash(100);
        ATM atm1 = new ATM();
        atm1.depositCheck(100,"12BK1233");
        ATM atm2 = new ATM();
        atm2.depositMobileTransfer("0788048876",100);




    }
}