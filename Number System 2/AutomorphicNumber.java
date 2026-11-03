
import java.util.Scanner;

class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int square = n * n;
        int temp = n;
        int count = 0;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int power = 1;

        for (int i = 1; i <= count; i++) {
            power = power * 10;
        }

        if (square % power == n) {
            System.out.println(n + " is Automorphic");
        } else {
            System.out.println(n + " is not Automorphic");
        }
    }
}
