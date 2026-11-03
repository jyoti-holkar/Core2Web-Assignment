
import java.util.Scanner;

class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {

                if (i % 2 == 1) {
                    System.out.print(j + "  ");
                } else {
                    System.out.print((char)('A' + j - 1) + "  ");
                }
            }
            System.out.println();
        }
    }
}
