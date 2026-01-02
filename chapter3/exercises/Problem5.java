package chapter3.exercises;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int todayDate = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();
        String day = "";
        
        switch (todayDate) {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            default:
                break;
        }
        int future = (todayDate + elapsed) % 7;
        String futureDay = "";

        switch (future) {
            case 0:
                futureDay = "Sunday";
                break;
            case 1:
                futureDay = "Monday";
                break;
            case 2:
                futureDay = "Tuesday";
                break;
            case 3:
                futureDay = "Wednesday";
                break;
            case 4:
                futureDay= "Thursday";
                break;
            case 5:
                futureDay = "Friday";
                break;
            case 6:
                futureDay = "Saturday";
                break;
            default:
                break;
        }

        System.out.println("Today is " + day + " and the future day is " + futureDay);
        input.close();
    }
}
