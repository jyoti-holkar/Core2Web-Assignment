import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0) {
                    System.out.print((char)('A' + n - j) + "\t");
                } else {
                    System.out.print(j + "\t");
                }
            }
            System.out.println();
        }
    }
}