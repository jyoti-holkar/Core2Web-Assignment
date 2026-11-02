import java.util.Scanner;

class Digits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        while(n > 0)
        {
            int rem = n % 10;
            System.out.print(rem + " ");
            n = n / 10;
        }
    }
}