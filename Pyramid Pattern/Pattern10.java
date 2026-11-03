
import java.util.Scanner;

class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= n; i++) {
            int count = 0;

            for (int j = 1; j <= 2 * i - 1; ) {

                int factors = 0;

                for (int k = 1; k <= num; k++) {
                    if (num % k == 0) {
                        factors++;
                    }
                }

                if (factors != 2) {
                    System.out.print(num + "  ");
                    j++;
                    count++;
                }

                num++;
            }

            System.out.println();
        }
    }
}
