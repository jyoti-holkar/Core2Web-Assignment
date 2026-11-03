
import java.util.Scanner;

class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = n; j >= n - i + 1; j--) {
                System.out.print(j + "  ");
            }

            for (int j = n - i + 2; j <= n; j++) {
                System.out.print(j + "  ");
            }

            System.out.println();
        }
    }
}
