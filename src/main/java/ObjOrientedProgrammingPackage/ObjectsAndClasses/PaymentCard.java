package ObjOrientedProgrammingPackage.ObjectsAndClasses;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }

    public void eatAffordably() {
        if(this.balance >= 2.6) {
            this.balance = this.balance - 2.6;
        }
    }

    public void eatHeartily() {
        if(this.balance >= 4.6) {
            this.balance = this.balance - 4.6;
        }
    }

    public void addMoney(double amount) {
        if ((amount+this.balance >= 150) && (amount > 0)) {
            this.balance = 150;
        } else if (amount > 0) {
            this.balance = this.balance+amount;
        }
    }
}