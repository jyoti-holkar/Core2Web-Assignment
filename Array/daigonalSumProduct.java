
    import java.util.Scanner;

class DiagonalSumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row = ");
        int r = sc.nextInt();

        System.out.print("Enter column = ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        int sum1 = 0, sum2 = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            sum1 = sum1 + a[i][i];
            sum2 = sum2 + a[i][c - 1 - i];
        }

        int product = sum1 * sum2;

        System.out.println("Product of Sum of Primary and Secondary Diagonal : " + product);

        sc.close();
    }
}
    

