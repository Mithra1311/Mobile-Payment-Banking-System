public class MobilePayment implements Payment {

    @Override
    public void sendMoney(String recipient, double amount) {
        System.out.println("Sent Rs." + amount + " to Mobile Number: " + recipient);
    }
}
