
import java.util.Scanner;

class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = n - i + 1; j <= n; j++) {
                char ch = (char)('A' + j - 1);
                System.out.print(ch + "  ");
            }

            for (int j = n - 1; j >= n - i + 1; j--) {
                char ch = (char)('A' + j - 1);
                System.out.print(ch + "  ");
            }

            System.out.println();
        }
    }
}
