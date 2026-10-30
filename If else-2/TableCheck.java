import java.util.Scanner;

public class TableCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 13 == 0) {
            System.out.println(num + " is in the table of 13");
        } else {
            System.out.println(num + " is not in the table of 13");
        }

        sc.close();
    }
}