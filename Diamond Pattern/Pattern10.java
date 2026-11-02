
import java.util.Scanner;

class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Print decreasing characters
            for (int j = n - i + 1; j >= 1; j--) {
                char ch = (char)('A' + j - 1);
                System.out.print(ch + "  ");
            }

            // Print increasing characters
            for (int j = 2; j <= n - i + 1; j++) {
                char ch = (char)('A' + j - 1);
                System.out.print(ch + "  ");
            }

            System.out.println();
        }

        for (int i = 2; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                char ch = (char)('A' + j - 1);
                System.out.print(ch + "  ");
            }

            for (int j = n - 1; j >= i; j--) {
                char ch = (char)('A' + j - 1);
                System.out.print(ch + "  ");
            }

            System.out.println();
        }
    }
}
