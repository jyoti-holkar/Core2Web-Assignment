
    import java.util.Scanner;

class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size = ");
        int n = sc.nextInt();

        int a[] = new int[n];
        int count = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Even numbers: ");

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                count++;
            }
        }

        System.out.println("\nCount of even elements is: " + count);

        sc.close();
    }
}
    

