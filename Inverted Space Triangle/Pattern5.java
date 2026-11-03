
import java.util.Scanner;

class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {

                if (i % 2 == 1) {
                    if (n % 2 == 1) {
                        char ch = (char)('A' + j - 1);
                        if (j % 2 == 0)
                            ch = (char)(ch + 32);
                        System.out.print(ch + "  ");
                    } else {
                        System.out.print(j + "  ");
                    }
                } else {
                    if (n % 2 == 1) {
                        System.out.print(j + "  ");
                    } else {
                        char ch = (char)('A' + j - 1);
                        System.out.print(ch + "  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
