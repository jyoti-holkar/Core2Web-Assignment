import java.util.Scanner;

public class Subcription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Movie Streaming Platform");
        System.out.println("1. Platinum Plan - Rs.799");
        System.out.println("2. Gold Plan - Rs.599");
        System.out.println("3. Silver Plan - Rs.399");
        System.out.println("4. Bronze Plan - Rs.199");
        System.out.println("5. Free Plan - Limited Access");

        System.out.print("Enter your plan choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Platinum Plan");
                System.out.println("Price: Rs.799");
                break;

            case 2:
                System.out.println("You selected Gold Plan");
                System.out.println("Price: Rs.599");
                break;

            case 3:
                System.out.println("You selected Silver Plan");
                System.out.println("Price: Rs.399");
                break;

            case 4:
                System.out.println("You selected Bronze Plan");
                System.out.println("Price: Rs.199");
                break;

            case 5:
                System.out.println("Free Plan with Limited Access");
                System.out.println("Price: Rs.0");
                break;

            default:
                System.out.println("Invalid Plan Selection");
        }
    }
}