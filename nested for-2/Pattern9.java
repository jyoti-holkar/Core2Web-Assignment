import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(j + "" + (char)('A' + j - 1) + "  ");
                }
            } else {
                for (int j = n; j >= 1; j--) {
                    System.out.print(j + "" + (char)('A' + j - 1) + "  ");
                }
            }
            System.out.println();
        }
    }
}