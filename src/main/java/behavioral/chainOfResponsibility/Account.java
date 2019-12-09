package behavioral.chainOfResponsibility;

public abstract class Account {
    private Account successor;
    protected double balance;

    public void setNext(Account account){
        this.successor = account;
    }

    public void pay(double amount){
        if (this.canPay(amount)){
            System.out.println("Paid $" + amount + " using " + this.getClass().getSimpleName());
        } else if (this.successor != null){
            System.out.println("Cannot pay using " + this.getClass().getSimpleName() + ", proceeding...");
            this.successor.pay(amount);
        } else {
            System.out.println("None of the accounts have enough balance.");
        }
    }

    private boolean canPay(double amount){
        return this.balance >= amount;
    }
}
