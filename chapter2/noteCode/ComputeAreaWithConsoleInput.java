package chapter2.noteCode;
import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args)
    {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a raduis
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        //Compute Area 
        double area = radius * radius * 3.14159;

        //Display Results
        System.out.println("The area for the circle of radius " + radius + 
            " is " + area
        );
    }
}
