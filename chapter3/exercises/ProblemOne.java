package chapter3.exercises;
import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        double discriminant = Math.pow(b,2) - 4 * a * c;

        if(discriminant > 0)
        {
            // If it is positive, the equation has two real roots
            double r1 = (-(b) + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / (2 * a);
            double r2 = (-(b)- Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / (2 * a);

            System.out.println("The equation has two roots " + (int) (r1 * 1000000 + 0.5) / 1000000.0 + " and " 
            + (int) (r2 * 100000)/ 100000.0);
        }
        else if(discriminant == 0)
        {
            // If it is zero, the equation has one root
            double oneRoot = -b / 2 * a;
            System.out.println("Equation has one root " + oneRoot);
        }
        else 
        {
            // If it is negative, the equation has no real roots 
            System.out.println("The equation has no real roots");
        }
        input.close();
    }
}
