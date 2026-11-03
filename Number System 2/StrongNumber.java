
import java.util.Scanner;

class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Start: ");
        int start = sc.nextInt();

        System.out.print("End: ");
        int end = sc.nextInt();

        for (int n = start; n <= end; n++) {
            int temp = n;
            int sum = 0;

            while (temp > 0) {
                int rem = temp % 10;

                int fact = 1;

                for (int i = 1; i <= rem; i++) {
                    fact = fact * i;
                }

                sum = sum + fact;
                temp = temp / 10;
            }

            if (sum == n) {
                System.out.print(n + " ");
            }
        }
    }
}
