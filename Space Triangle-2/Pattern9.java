
import java.util.Scanner;

class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        char ch = 'A';

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {

                if (i % 2 != 0) {
                    System.out.print(i + "" + ch + " ");
                } else {
                    System.out.print(i + "" +
                        Character.toLowerCase(ch) + " ");
                }

                ch++;
            }
            System.out.println();
        }
    }
}
