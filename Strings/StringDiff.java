
import java.util.Scanner;

class StringDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int difference = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                difference += Math.abs(str1.charAt(i) - str2.charAt(i));
            }
        }

        System.out.println("Difference = " + difference);
    }
}
    

