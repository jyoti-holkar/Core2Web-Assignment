import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter selling price: ");
        int sellingPrice = sc.nextInt();

        System.out.print("Enter cost price: ");
        int costPrice = sc.nextInt();

        if (sellingPrice > costPrice) {
            int profit = sellingPrice - costPrice;
            System.out.println("Profit of " + profit);
        }
        else if (sellingPrice < costPrice) {
            int loss = costPrice - sellingPrice;
            System.out.println("Loss of " + loss);
        }
        else {
            System.out.println("No profit no loss");
        }

        sc.close();
    }
}