public class Bitwise {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Initial value of a: " + a);
        System.out.println("Initial value of b: " + b);

        a += 3;
        System.out.println("After a += 3, a = " + a);

        b -= 2;
        System.out.println("After b -= 2, b = " + b);

        a *= 2;
        System.out.println("After a *= 2, a = " + a);

        b /= 3;
        System.out.println("After b /= 3, b = " + b);

        a %= 5;
        System.out.println("After a %= 5, a = " + a);
    }
}