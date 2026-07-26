public class BankPayment implements Payment {

    @Override
    public void sendMoney(String recipient, double amount) {
        System.out.println("Sent Rs." + amount + " to Bank/UPI ID: " + recipient);
    }
}
