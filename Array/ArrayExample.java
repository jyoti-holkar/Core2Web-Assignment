
    import java.util.Scanner;

class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        if (n % 2 == 0) {
            for (int i = 0; i < n; i += 2) {
                System.out.println(a[i]);
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println(a[i]);
            }
        }

        sc.close();
    }
}
    

