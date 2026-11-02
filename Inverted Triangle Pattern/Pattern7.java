
import java.util.Scanner;

class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int num = n - i + 1;
            char ch = (char)('a' + n - i - 1);

            for (int j = 1; j <= n - i + 1; j++) {

                if (j % 2 != 0) {
                    System.out.print(num + "\t");
                    num = num - 1;
                } else {
                    System.out.print(ch + "\t");
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
