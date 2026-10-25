
    import java.util.Scanner;

class OddIndexProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int n = sc.nextInt();

        int a[] = new int[n];
        int product = 1;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i += 2) {
            product = product * a[i];
        }

        System.out.println("Product of odd indexed elements: " + product);

        sc.close();
    }
}
    

