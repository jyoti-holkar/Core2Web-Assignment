
import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Start: ");
        int start = sc.nextInt();

        System.out.print("End: ");
        int end = sc.nextInt();

        for (int n = start; n <= end; n++) {
            int temp = n;
            int count = 0;
            int sum = 0;

            int t = n;

            while (t > 0) {
                count++;
                t = t / 10;
            }

            temp = n;

            while (temp > 0) {
                int rem = temp % 10;
                int power = 1;

                for (int i = 1; i <= count; i++) {
                    power = power * rem;
                }

                sum = sum + power;
                temp = temp / 10;
            }

            if (sum == n) {
                System.out.print(n + " ");
            }
        }
    }
}
