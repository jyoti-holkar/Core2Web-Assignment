
import java.util.Scanner;

class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 2 * i - 1; j++) {

                System.out.print(a + "  ");

                int c = a + b;
                a = b;
                b = c;
            }

            System.out.println();
        }
    }
}
