
    import java.util.Scanner;

class MinimumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int min = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Minimum number in the array is: " + min);

        sc.close();
    }
}
    

