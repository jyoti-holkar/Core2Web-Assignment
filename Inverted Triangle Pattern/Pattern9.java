
import java.util.Scanner;

class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 0; j--) {

                char ch = (char)('A' + j);

                if (i % 2 != 0) {
                    if (i == 1)
                        System.out.print((char)(ch + 32) + "\t");
                    else
                        System.out.print((char)(ch + 32) + "\t");
                } else {
                    System.out.print(ch + "\t");
                }
            }
            System.out.println();
        }
    }
}
