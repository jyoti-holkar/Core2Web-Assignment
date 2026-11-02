import java.util.Scanner;

class Pattern9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = i; j <= n; j++)
            {
                int value = j + 64;

                if((i + j) % 2 == 0)
                    System.out.print((char)value + "  ");
                else
                    System.out.print(value + "  ");
            }
            System.out.println();
        }
    }
}