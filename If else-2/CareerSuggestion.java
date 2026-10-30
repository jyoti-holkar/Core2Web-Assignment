import java.util.Scanner;

public class CareerSuggestion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        if (percentage > 85) {
            System.out.println("Medical");
        } 
        else if (percentage > 75 && percentage <= 85) {
            System.out.println("Engineering");
        } 
        else {
            System.out.println("Other Career Fields");
        }

        sc.close();
    }
}