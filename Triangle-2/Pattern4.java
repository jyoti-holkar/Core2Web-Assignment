
import java.util.Scanner;

class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if (i % 2 != 0) {
                    if (i == 1)
                        System.out.print((char)('a' + n - 1) + "\t");
                    else
                        System.out.print((char)('a' + n - j) + "\t");
                } else {
                    System.out.print((n - j + 1) + "\t");
                }
            }
            System.out.println();
        }
    }
}
