import java.util.Scanner;

class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            StringBuffer sb = new StringBuffer(words[i]);
            System.out.print(sb.reverse() + " ");
        }
    }
}
    

