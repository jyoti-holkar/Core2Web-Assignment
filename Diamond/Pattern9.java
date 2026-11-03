
import java.util.Scanner;

class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int num = n - i + 1;

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print((num * j) + "  ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            int num = n - i + 1;

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print((num * j) + "  ");
            }
            System.out.println();
        }
    }
}
