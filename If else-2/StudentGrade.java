import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        double percent = sc.nextDouble();

        if (percent > 75 && percent <= 100) {
            System.out.println("Passed : First Class with Distinction");
        }
        else if (percent >= 60) {
            System.out.println("Passed : First Class");
        }
        else if (percent >= 50) {
            System.out.println("Passed : Second Class");
        }
        else if (percent >= 35) {
            System.out.println("Pass");
        }
        else if (percent >= 0) {
            System.out.println("Fail");
        }
        else {
            System.out.println("Invalid percentage");
        }

        sc.close();
    }
}