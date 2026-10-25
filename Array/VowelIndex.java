
    import java.util.Scanner;

class VowelIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int n = sc.nextInt();

        char a[] = new char[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' ||
                a[i] == 'o' || a[i] == 'u' || a[i] == 'A' ||
                a[i] == 'E' || a[i] == 'I' || a[i] == 'O' ||
                a[i] == 'U') {
                System.out.println("Vowel " + a[i] + " found at index " + i);
            }
        }

        sc.close();
    }
}
    

