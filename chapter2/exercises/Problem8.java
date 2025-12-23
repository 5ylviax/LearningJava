package chapter2.exercises;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();
        
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliSeconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliSeconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSeconds = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;
        
        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

         long currentHourOffset = (currentHour + offset + 24) % 24;
        // Display results 
        System.out.println(
            "The current time is " +
            currentHourOffset + ":" +
            currentMinute + ":" +
            currentSeconds
        );
    }
}
