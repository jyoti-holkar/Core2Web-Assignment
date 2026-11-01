import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int num = (2 * j) + i - 1;

                if (num > 2 * n - 1) {
                    num = num - (2 * n - 1);
                }

                System.out.print(num + "  ");
            }
            System.out.println();
        }
    }
}