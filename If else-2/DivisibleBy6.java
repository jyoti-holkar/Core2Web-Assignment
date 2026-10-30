import java.util.Scanner;

public class DivisibleBy6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a float number: ");
        float floatNum = sc.nextFloat();

        if (floatNum % 6 == 0) {
            System.out.println(floatNum + " is divisible by 6.");
        } else {
            System.out.println(floatNum + " is not divisible by 6.");
        }

        sc.close();
    }
}