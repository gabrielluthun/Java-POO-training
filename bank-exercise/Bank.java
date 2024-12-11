public class Bank {

    private String name;

    public Bank(String name) {
        this.name = name;
    }
// On utilise des génériques pour définir les types des comptes source et cible
    public <T, S> void transfert(Account<T> sourceAccount, Account<S> targetAccount, int amount) {

       if (sourceAccount.getAmount() >= amount) {
           sourceAccount.removeMoney(amount);
           targetAccount.addMoney(amount);
           System.out.println("Transfert de " + amount + " " + sourceAccount.getCurrency() + " de " + sourceAccount.getOwner() + " à " + targetAccount.getOwner() + " effectué.");
       } else {
           System.out.println("Transfert impossible ! " + sourceAccount.getOwner() + " n'a pas assez d'argent sur son compte.");
       }
    }
}
