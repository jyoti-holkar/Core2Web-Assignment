import java.util.Scanner;

class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int num = (i - 1) * n + j;

                if (j % 2 != 0)
                    System.out.print((int)Math.pow(num, 3) + "  ");
                else
                    System.out.print((int)Math.pow(num, 2) + "  ");
            }
            System.out.println();
        }
    }
}