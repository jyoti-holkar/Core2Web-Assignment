import java.util.Scanner;

class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.replace(" ", "");

        System.out.println("String: " + str);
    }
}
    

