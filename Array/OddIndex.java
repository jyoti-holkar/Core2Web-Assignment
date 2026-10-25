
    import java.util.Scanner;

class OddIndex {
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
            if (i % 2 != 0) {
                System.out.println(a[i] + " is an odd indexed element");
            }
        }

        sc.close();
    }
}
    

