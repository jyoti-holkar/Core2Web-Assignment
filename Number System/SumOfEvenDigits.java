import java.util.Scanner;

class SumOfEvenDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int num = n;

        while(n > 0)
        {
            int rem = n % 10;

            if(rem % 2 == 0)
            {
                sum = sum + rem;
            }

            n = n / 10;
        }

        System.out.println("The sum of even numbers from " + num + " is " + sum);
    }
}