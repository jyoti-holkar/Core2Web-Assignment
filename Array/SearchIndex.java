
    import java.util.Scanner;

class SearchIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search in array:");
        int num = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (a[i] == num) {
                System.out.println(num + " found at index " + i);
                break;
            }
        }

        sc.close();
    }
}
    

