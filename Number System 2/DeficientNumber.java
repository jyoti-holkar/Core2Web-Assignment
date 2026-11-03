
import java.util.Scanner;

class DeficientNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Start: ");
        int start = sc.nextInt();

        System.out.print("End: ");
        int end = sc.nextInt();

        for (int n = start; n <= end; n++) {
            int sum = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }

            if (sum < n) {
                System.out.print(n + " ");
            }
        }
    }
}
