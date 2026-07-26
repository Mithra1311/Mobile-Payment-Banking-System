import java.util.ArrayList;

public class Transaction {

    private double balance;
    private ArrayList<String> transactionHistory;

    public Transaction(double initialBalance) {
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public boolean processPayment(Payment paymentMethod, String recipient, double amount) {

        if (amount > 0 && amount <= balance) {

            balance -= amount;
            paymentMethod.sendMoney(recipient, amount);
            transactionHistory.add("Sent Rs." + amount + " to " + recipient);

            return true;

        } else {

            System.out.println("Transaction Failed! Insufficient balance or invalid amount.");
            return false;

        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }

    public void viewTransactionHistory() {

        System.out.println("\nTransaction History");

        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions found.");
        } else {

            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }
}
