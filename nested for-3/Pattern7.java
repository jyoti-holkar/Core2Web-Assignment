import java.util.Scanner;

class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i + "  ");
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    System.out.print((char)('A' + i - 1) + "  ");
                }
            }
            System.out.println();
        }
    }
}