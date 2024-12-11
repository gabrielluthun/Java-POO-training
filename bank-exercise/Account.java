public class Account<T> {
    private String owner;
    private double amount;
    private final T currency;

    public Account(String owner, double amount, T currency) {
        this.owner = owner;
        this.amount = amount;
        this.currency = currency;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public T getCurrency() {
        return currency;
    }

    public void addMoney(double amount) {
        this.amount += amount;
    }

    public void removeMoney(double amount) {
        this.amount -= amount;
    }

    public void showBalance() {
        System.out.println(owner + "," + " vous avez " + amount + " " + currency + " sur votre compte.");
    }
}
