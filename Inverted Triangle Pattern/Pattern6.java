
import java.util.Scanner;

class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {

                if (j % 2 != 0) {
                    System.out.print((j + 1) / 2 + "\t");
                } else {
                    System.out.print((char)('a' + j / 2 - 1) + "\t");
                }
            }
            System.out.println();
        }
    }
}
