
import java.util.Scanner;

class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {

                if (num % 2 != 0) {
                    System.out.print((num * num) + " ");
                } else {
                    System.out.print(num + " ");
                }

                num++;
            }
            System.out.println();
        }
    }
}
