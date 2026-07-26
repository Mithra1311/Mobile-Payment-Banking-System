import java.util.Scanner;

public class PaymentSystemApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Transaction transaction = new Transaction(5000);

        while (true) {

            System.out.println("\n===== Mobile Payment Banking System =====");
            System.out.println("1. Send Money to Mobile Number");
            System.out.println("2. Send Money to Bank/UPI ID");
            System.out.println("3. Send Money to Self Account");
            System.out.println("4. Check Balance");
            System.out.println("5. View Transaction History");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                case 2:
                case 3:

                    System.out.print("Enter Recipient: ");
                    String recipient = scanner.nextLine();

                    System.out.print("Enter Amount: Rs.");
                    double amount = scanner.nextDouble();

                    Payment payment;

                    if (choice == 1) {
                        payment = new MobilePayment();
                    } else if (choice == 2) {
                        payment = new BankPayment();
                    } else {
                        payment = new SelfAccountPayment();
                    }

                    transaction.processPayment(payment, recipient, amount);
                    break;

                case 4:
                    transaction.checkBalance();
                    break;

                case 5:
                    transaction.viewTransactionHistory();
                    break;

                case 6:
                    System.out.println("Thank you for using the Mobile Payment Banking System.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
