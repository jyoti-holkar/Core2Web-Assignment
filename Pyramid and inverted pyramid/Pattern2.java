import java.util.Scanner;

class Pattern2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int num = 1;

        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= (2*i-1); j++)
            {
                System.out.print(num + "  ");
                num++;
            }
            System.out.println();
        }
    }
}