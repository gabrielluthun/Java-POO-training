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