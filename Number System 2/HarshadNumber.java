
import java.util.Scanner;

class HarshadNumber {
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
                sum = sum + rem;
                temp = temp / 10;
            }

            if (n % sum == 0) {
                System.out.print(n + " ");
            }
        }
    }
}
