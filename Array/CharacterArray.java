
    import java.util.Scanner;

class CharacterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        char a[] = new char[size];

        System.out.println("Enter characters:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.next().charAt(0);
        }

        System.out.println("Characters are:");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }
}
    

