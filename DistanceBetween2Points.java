import java.util.Scanner;

public class DistanceBetween2Points {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordintes of Pont1");
        System.out.println("Enter x1 coordinate");
        float x1 = input.nextFloat();
        System.out.println("Enter the y1 coordinate");
        float y1 = input.nextFloat();
        System.out.println("Enter the coordinates of the Point2");
        System.out.println("Enter the x2 coordinate");
        float x2 = input.nextFloat();
        System.out.println("Enter the y2 coordinate");
        float y2 = input.nextFloat();
        double distance;
        distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        System.out.println("The distance between 2 points i.e Point1 and Point2 is " + distance);
        
        input.close();
    }
}
