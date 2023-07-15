import java.util.Scanner;

public class ATMInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userId = 12345;
        int pin = 1234;

        System.out.print("Enter User ID: ");
        int enteredUserId = scanner.nextInt();
        System.out.print("Enter PIN: ");
        int enteredPin = scanner.nextInt();

        if (enteredUserId == userId && enteredPin == pin) {
            System.out.println("ATM Functionality:");
            System.out.println("1. Transactions History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Showing transactions history...");
                    break;
                case 2:
                    System.out.println("Withdrawing money...");
                    break;
                case 3:
                    System.out.println("Depositing money...");
                    break;
                case 4:
                    System.out.println("Transferring money...");
                    break;
                case 5:
                    System.out.println("Quitting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } else {
            System.out.println("Authentication failed. Invalid user id or pin.");
        }

        scanner.close();
    }
}
