public class DivisibleCheck {
    public static void main(String[] args) {
        int num = 10;

        if (num % 2 == 0 && num % 5 == 0 && num % 10 == 0) {
            System.out.println(num + " is divisible by 2,5 and 10");
        }
        else {
            System.out.println(num + " Is Not Divisible By 2,5 and 10");
        }
    }
}