package chapter2.exercises;
import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args)
    {
        final double PI = 3.14159; // Declare a constant

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("The area is " + (int) (area * 10000 + 0.5) / 10000.0);
        System.out.println("The volume is " + (int) (volume * 10 + 0.5) / 10.0);
    }
}