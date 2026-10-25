
    import java.util.Scanner;

class DivisibleBy4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (a[i] % 4 == 0) {
                System.out.println(a[i] + " is divisible by 4 and its index is " + i);
            }
        }

        sc.close();
    }
}
    

