import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        char[] symbols = {'#', '$', '@'};

        for (int i = 1; i <= n; i++) {
            char ch = symbols[(i - 1) % 3];

            for (int j = 1; j <= n; j++) {
                System.out.print(ch + "  ");
            }
            System.out.println();
        }
    }
}