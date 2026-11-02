
import java.util.Scanner;

class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {

                if (i % 2 != 0) {
                    System.out.print(j + "\t");
                } else {
                    System.out.print((char)('A' + i - j) + "\t");
                }
            }
            System.out.println();
        }
    }
}
