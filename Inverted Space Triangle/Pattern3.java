
import java.util.Scanner;

class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        char ch = 'a';

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {

                if (j % 2 == 0) {
                    System.out.print(j / 2 + "  ");
                } else {
                    System.out.print(ch + "  ");
                    ch++;
                }
            }
            System.out.println();
        }
    }
}
