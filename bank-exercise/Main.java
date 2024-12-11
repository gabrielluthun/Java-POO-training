import java.io.Console;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Account<Character> myAccount = new Account<> ("Gabriel", 1000, '€');
        myAccount.showBalance();

        Account <Character>otherAccount = new Account<> ("Alice", 2000, '€');
        otherAccount.showBalance();

        Bank bank = new Bank("GabrielBank");

        bank.transfert(otherAccount, myAccount, 621);

        myAccount.showBalance();
        otherAccount.showBalance();
    }

}