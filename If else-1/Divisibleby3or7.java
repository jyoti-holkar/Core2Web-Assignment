public class DivisibleBy3Or7 {
    public static void main(String[] args) {
        int num = 15;

        if (num % 3 == 0 || num % 7 == 0) {
            System.out.println(num + " is divisible by 3 or 7");
        }
        else {
            System.out.println(num + " is not divisible by 3 or 7");
        }
    }
}