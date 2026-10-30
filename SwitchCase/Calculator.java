
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter num2: ");
        double num2 = sc.nextDouble();

        switch (op) {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("Result = " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            case '%':
                if (num2 != 0) {
                    System.out.println("Result = " + (num1 % num2));
                } else {
                    System.out.println("Cannot find modulus by zero");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
    
