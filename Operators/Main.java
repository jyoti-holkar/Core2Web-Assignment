 
public class Main {
    public static void main(String[] args) {
        int x = 19;

        System.out.println("Expression 1: " + (x++ + x++));

        x = 19;
        System.out.println("Expression 2: " + (++x + x++ + ++x));
    }
}
 
