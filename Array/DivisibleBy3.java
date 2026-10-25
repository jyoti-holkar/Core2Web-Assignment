
    import java.util.Scanner;

class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        int sum = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Elements divisible by 3: ");

        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0) {
                System.out.print(a[i] + " ");
                sum = sum + a[i];
            }
        }

        System.out.println("\nSum of elements divisible by 3 is: " + sum);

        sc.close();
    }
}
    

