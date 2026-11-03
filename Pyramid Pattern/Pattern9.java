
import java.util.Scanner;

class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        int num = 2;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (2 * i - 1); ) {

                int count = 0;

                for (int k = 1; k <= num; k++) {
                    if (num % k == 0) {
                        count++;
                    }
                }

                if (count == 2) {
                    System.out.print(num + "  ");
                    j++;
                }

                num++;
            }

            System.out.println();
        }
    }
}
