package chapter3.exercises;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH =  0.0254;
        
        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;

        double heightInMeters = ((feet * 12) + inches) * METERS_PER_INCH;

        double bmi = weightInKilograms / (Math.pow(heightInMeters, 2));

        System.out.println("BMI is " + bmi);

        if(bmi < 18.5){
            System.out.println("Underweight");
        }
        else if(bmi < 25)
        {
            System.out.println("Normal");
        }
        else if(bmi < 30)
        {
            System.out.println("Overweight");
        }
        else
        {
            System.out.println("Obese");
        }
         input.close();
    } 
}
