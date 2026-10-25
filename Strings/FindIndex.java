import java.util.Scanner;

class FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Index: " + str.indexOf('a'));
    }
}
    

