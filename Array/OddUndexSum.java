
    import java.util.Scanner;

class OddUndexSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int n = sc.nextInt();

        int a[] = new int[n];
        int sum = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i += 2) {
            sum = sum + a[i];
        }

        System.out.println("Sum of odd indexed elements: " + sum);

        sc.close();
    }
}
    

