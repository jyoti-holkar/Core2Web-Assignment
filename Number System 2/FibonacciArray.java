
import java.util.Scanner;

class FibonacciArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        if (n >= 1)
            a[0] = 0;

        if (n >= 2)
            a[1] = 1;

        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }

        System.out.println("Fibonacci Series:");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
