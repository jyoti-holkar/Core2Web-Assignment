
import java.util.Scanner;

class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        int num = 1;
        char ch = 'a';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if (j % 2 == 1) {
                    System.out.print(num + "\t");
                } else {
                    System.out.print(ch + "\t");
                }

                num++;
                ch++;
            }
            System.out.println();
        }
    }
}
