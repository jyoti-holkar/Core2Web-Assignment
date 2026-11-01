import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0)
                        System.out.print((char)('A' + n - j) + "\t");
                    else
                        System.out.print(n - j + 1 + "\t");
                } else {
                    if (j % 2 != 0)
                        System.out.print((char)('A' + j - 1) + "\t");
                    else
                        System.out.print(j + "\t");
                }
            }
            System.out.println();
        }
    }
}