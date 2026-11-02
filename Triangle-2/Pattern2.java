
import java.util.Scanner;

class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
