
import java.util.Scanner;

class ReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.replace('a', 'e');

        System.out.println("Output: " + str);
    }
}
    
