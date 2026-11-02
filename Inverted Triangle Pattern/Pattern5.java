
import java.util.Scanner;

class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {

                if (i % 2 != 0) {
                    System.out.print((char)('A' + j - 1) + "\t");
                } else {
                    System.out.print((char)('a' + j - 1) + "\t");
                }
            }
            System.out.println();
        }
    }
}
