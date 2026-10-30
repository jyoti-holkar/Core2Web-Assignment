import java.util.Scanner;

class WholeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}