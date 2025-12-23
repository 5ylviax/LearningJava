package chapter2.exercises;

import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a degree in Celsius: ");
        double degreeInCelsius = input.nextDouble();

        double fahrenheit = (9.0 / 5.0) * degreeInCelsius + 32;

        System.out.println(degreeInCelsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
