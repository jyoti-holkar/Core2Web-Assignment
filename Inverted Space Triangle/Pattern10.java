
import java.util.Scanner;

class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        int num = n * n * (n - 1);

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(num + "  ");
                num -= n;
            }
            System.out.println();
        }
    }
}
