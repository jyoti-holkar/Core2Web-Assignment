import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a*a + b*b == c*c) {
            System.out.println("It is a Pythagorean triplet");
        }
        else if (a*a + c*c == b*b) {
            System.out.println("It is a Pythagorean triplet");
        }
        else if (b*b + c*c == a*a) {
            System.out.println("It is a Pythagorean triplet");
        }
        else {
            System.out.println("It is not a Pythagorean triplet");
        }

        sc.close();
    }
}