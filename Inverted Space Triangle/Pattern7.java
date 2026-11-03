
import java.util.Scanner;

class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {

                if (ch % 2 == 1) {
                    System.out.print(ch + "  ");
                } else {
                    System.out.print(
                        (char)(ch + 32) + "  ");
                }

                ch++;
            }
            System.out.println();
        }
    }
}
