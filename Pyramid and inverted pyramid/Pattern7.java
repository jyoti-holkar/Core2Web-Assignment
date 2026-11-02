import java.util.Scanner;

class Pattern7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        int num = 2;

        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= (2*rows-2*i+1); j++)
            {
                System.out.print(num + "  ");
                num = num + 2;
            }
            System.out.println();
        }
    }
}