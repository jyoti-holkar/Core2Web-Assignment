
import java.util.Scanner;

class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            char ch = (char)('A' + i - 1);

            for (int j = 1; j <= (2 * (n - i) + 1); j++) {
                System.out.print(ch + "  ");
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            char ch = (char)('A' + i - 1);

            for (int j = 1; j <= (2 * (n - i) + 1); j++) {
                System.out.print(ch + "  ");
            }
            System.out.println();
        }
    }
}
