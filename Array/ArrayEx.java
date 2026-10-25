
    
import java.util.Scanner;

class ArrayEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

        System.out.println("Enter 10 elements:");

        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }
}

    

