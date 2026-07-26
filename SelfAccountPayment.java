public class SelfAccountPayment implements Payment {

    @Override
    public void sendMoney(String recipient, double amount) {
        System.out.println("Transferred Rs." + amount + " to Self Account: " + recipient);
    }
}
