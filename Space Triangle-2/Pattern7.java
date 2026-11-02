
import java.util.Scanner;

class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        int num = 1;
        char ch = 'A';

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {

                if (i % 2 != 0) {
                    System.out.print(num + " ");
                    num++;
                } else {
                    System.out.print(ch + " ");
                }
            }

            if (i % 2 == 0) {
                ch++;
            }

            System.out.println();
        }
    }
}
