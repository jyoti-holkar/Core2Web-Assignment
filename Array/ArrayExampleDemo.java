
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

        for (int i = 0; i < n; i++) {
            if (a[i] > 5 && a[i] < 9) {
                System.out.println(a[i] +
                    " is greater than 5 but less than 9");
            }
        }

        sc.close();
    }
}
    

