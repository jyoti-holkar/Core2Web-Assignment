
import java.util.Scanner;

class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (2 * (n - i) + 1); j++) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
}
