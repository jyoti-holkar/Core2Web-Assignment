import java.util.Scanner;

class ThreeDigitNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = 100; i < 100 + n; i++) {
            System.out.print(i + " ");
        }
    }
}