import java.util.Scanner;

class Pattern5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= (2*i-1); j++)
            {
                if(i % 2 == 1)
                {
                    System.out.print((char)(64+j) + " ");
                }
                else
                {
                    System.out.print((char)(96+j) + " ");
                }
            }
            System.out.println();
        }
    }
}