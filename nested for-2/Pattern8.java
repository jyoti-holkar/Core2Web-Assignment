import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (num % 2 != 0) {
                    System.out.print((num * num) + "  ");
                } else {
                    System.out.print(num + "  ");
                }
                num++;
            }
            System.out.println();
        }
    }
}