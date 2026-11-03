
import java.util.Scanner;

class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int temp = n;

        while (temp != 1 && temp != 4) {
            int sum = 0;

            while (temp > 0) {
                int rem = temp % 10;
                sum = sum + rem * rem;
                temp = temp / 10;
            }

            temp = sum;
        }

        if (temp == 1) {
            System.out.println(n + " is a happy number");
        } else {
            System.out.println(n + " is not a happy number");
        }
    }
}
