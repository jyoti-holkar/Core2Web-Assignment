import java.util.Scanner;

public class CanteenBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your bill amount: ");
        double bill = sc.nextDouble();

        double discount;
        double finalBill;

        if (bill > 200) {
            discount = bill * 10 / 100;
            finalBill = bill - discount;

            System.out.println("You got 10% discount!");
            System.out.println("Discount: Rs. " + discount);
        }
        else {
            finalBill = bill;

            System.out.println("No discount available.");
        }

        System.out.println("Final Bill: Rs. " + finalBill);

        sc.close();
    }
}