import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                char ch = (char) ('A' + j - 1);

                System.out.print(j + "" + ch + "  ");
            }
            System.out.println();
        }
    }
}