
import java.util.Scanner;

class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {

                int num = j + 64;

                if (i % 2 != 0) {
                    if (j % 2 != 0)
                        System.out.print((char)num + "\t");
                    else
                        System.out.print(num + "\t");
                } else {
                    if (j % 2 != 0)
                        System.out.print(num + "\t");
                    else
                        System.out.print((char)num + "\t");
                }
            }
            System.out.println();
        }
    }
}
