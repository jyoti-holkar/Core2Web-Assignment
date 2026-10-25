
    import java.util.Scanner;

class Sum2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row = ");
        int r = sc.nextInt();

        System.out.print("Enter column = ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        int sum = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
                sum = sum + a[i][j];
            }
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
    

