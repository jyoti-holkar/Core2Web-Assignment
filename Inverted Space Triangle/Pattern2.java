
import java.util.Scanner;

class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {

                if (j % 2 == 1) {
                    System.out.print(j + "  ");
                } else {
                    System.out.print((char)('A' + j) + "  ");
                }
            }
            System.out.println();
        }
    }
}
