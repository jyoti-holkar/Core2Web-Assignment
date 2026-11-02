import java.util.Scanner;

class EvenAndOddSquare
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        while(n > 0)
        {
            int rem = n % 10;

            if(rem % 2 == 0)
            {
                System.out.print(rem + ", ");
            }
            else
            {
                System.out.print((rem * rem) + ", ");
            }

            n = n / 10;
        }
    }
}
    

