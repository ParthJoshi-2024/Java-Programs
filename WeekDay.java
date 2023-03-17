import java.util.Scanner;

public class WeekDay{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day to check weekday or weekend");
        // int day = in.nextInt(); 
        // switch(day){
        //     case 1,2,3,4,5 -> System.out.println("Week Day");
        //     case 6, 7 -> System.out.println("Weekend Days");

        // }
        
            String day = in.next();
            switch(day){
                case "Monday", "Tuesday","Wednesday", "Thursday","Friday" -> System.out.println("Week Day");
                case "monday", "tuesday","wednesday", "thursday","friday" -> System.out.println("Week Day");
                case "Saturday", "Sunday" -> System.out.println("Weekend Day");
                case "1","2","3","4","5" -> System.out.println("Week Day");
                case "6","7" -> System.out.println("WeekEnd Day");
                default -> System.out.println("Enter correct day");
            }

        in.close();
    }
}