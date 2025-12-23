package chapter2.exercises;
import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F:");
        double farenheit = input.nextDouble();
        
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        double windChill = 35.74 + 0.6215 * farenheit - 35.75 * Math.pow(windSpeed, 0.16) 
        + 0.4275 * farenheit * Math.pow(windSpeed, 0.16);

        System.out.println("The wind chill index is " +  windChill);
    }
}