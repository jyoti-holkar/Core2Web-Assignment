import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000;

        System.out.println("Welcome to ATM");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Mini Statement");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Balance = Rs." + balance);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                int deposit = sc.nextInt();
                balance += deposit;
                System.out.println("Deposited Successfully");
                System.out.println("Balance = Rs." + balance);
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ");
                int withdraw = sc.nextInt();

                if (withdraw > 0 && withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Please collect your cash");
                    System.out.println("Balance = Rs." + balance);
                } else {
                    System.out.println("Insufficient Balance or Invalid Amount");
                }
                break;

            case 4:
                System.out.println("Mini Statement");
                System.out.println("Available Balance = Rs." + balance);
                break;

            case 5:
                System.out.println("Thank you for using ATM");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}