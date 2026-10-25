
import java.util.Scanner;

class CheckSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        System.out.println("Enter the substring to check:");
        String sub = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);

        if (sb.toString().toLowerCase().contains(sub.toLowerCase())) {
            System.out.println("The sentence contains the substring \"" 
                    + sub.toLowerCase() + "\".");
        } else {
            System.out.println("The sentence does not contain the substring \"" 
                    + sub.toLowerCase() + "\".");
        }
    }
}

