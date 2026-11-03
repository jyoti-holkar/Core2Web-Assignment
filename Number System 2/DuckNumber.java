
import java.util.Scanner;

class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Start: ");
        int start = sc.nextInt();

        System.out.print("End: ");
        int end = sc.nextInt();

        for (int n = start; n <= end; n++) {
            int temp = n;
            boolean flag = false;

            while (temp > 0) {
                int rem = temp % 10;

                if (rem == 0) {
                    flag = true;
                    break;
                }

                temp = temp / 10;
            }

            if (flag) {
                System.out.print(n + " ");
            }
        }
    }
}
