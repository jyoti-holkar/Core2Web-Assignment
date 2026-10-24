public class Demo {
    
    public static void main(String[] args) {
        int x = 14, y = 22;

        System.out.println("1. " + (++x + y++));

        x = 14;
        y = 22;
        System.out.println("2. " + (x++ + ++y + ++x + ++x));

        x = 14;
        y = 22;
        System.out.println("3. " + (y++ + ++x + ++x));
    }
}

    

