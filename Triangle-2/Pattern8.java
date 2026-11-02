
import java.util.Scanner;

class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if (j == 1) {
                    System.out.print(i + "\t");
                } 
                else if (j % 2 == 0) {
                    System.out.print((char)('A' + i - 2) + "\t");
                } 
                else {
                    System.out.print(i - j + 1 + "\t");
                }
            }
            System.out.println();
        }
    }
}
