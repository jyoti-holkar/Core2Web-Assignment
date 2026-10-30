import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        System.out.print("Enter marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        int m5 = sc.nextInt();

        if (m1 >= 35 && m2 >= 35 && m3 >= 35 &&
            m4 >= 35 && m5 >= 35) {

            total = m1 + m2 + m3 + m4 + m5;

            double percentage = total / 5.0;

            System.out.println("Total Marks = " + total);
            System.out.println("Percentage = " + percentage);

            switch ((int) percentage / 5) {
                case 20:
                case 19:
                case 18:
                case 17:
                case 16:
                case 15:
                    System.out.println("First Class with Distinction");
                    break;

                case 14:
                case 13:
                case 12:
                    System.out.println("First Class");
                    break;

                case 11:
                case 10:
                    System.out.println("Second Class");
                    break;

                default:
                    System.out.println("Pass Class");
            }

        } else {
            System.out.println("You failed the exam");
        }
    }
}