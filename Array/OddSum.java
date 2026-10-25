
    
import java.util.Scanner;

class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int sum = 0;

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                sum = sum + a[i];
            }
        }

        System.out.println("Sum of odd elements: " + sum);

        sc.close();
    }
}

    

