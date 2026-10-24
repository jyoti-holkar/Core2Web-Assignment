public class Program {
    public static void main(String[] args) {
        int x = 0;

        System.out.println("1. Pre-increment: " +
                           (++x + ++x + ++x + ++x));

        x = 0;
        System.out.println("2. Post-increment: " +
                           (x++ + x++ + x++ + x++));
    }
} 
