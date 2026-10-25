
import java.util.Scanner;

class FirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("First: " + str.charAt(0));
        System.out.println("Last: " + str.charAt(str.length() - 1));
    }
}
    

