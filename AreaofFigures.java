import java.util.Scanner;

public class AreaofFigures {
    public static void main(String[] args) {
/*
Area Of Circle Java Program
Area Of Triangle
Area Of Rectangle Program
Area Of Isosceles Triangle
Area Of Parallelogram
Area Of Rhombus
Area Of Equilateral Triangle
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the option");
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Triangle");
        System.out.println("3. Area of Rectangle");
        System.out.println("4. Area of Parallelolgram");
        System.out.println("5. Area of Rhombus");
        System.out.println("6. Area of Equilateral Triangle");
        int option = input.nextInt();
        switch(option){
            case 1:
                System.out.println("Enter the radius");
                float radius = input.nextFloat();
                System.out.println("Area of Circle is " + (3.14*radius*radius));
                break;
            case 2:
                System.out.println("Enter base and height");
                float base = input.nextFloat();
                float height = input.nextFloat();
                System.out.println("The Area of Triangle is " + (0.5*base*height));
                break;
            case 3:
                System.out.println("Enter the Length and Height");
                float length = input.nextFloat();
                float breadth = input.nextFloat();
                System.out.println("Area of Rectangle is " + (length*breadth));
                break;
            case 4:
                System.out.println("Enter base and perpendicular height");
                float base1 = input.nextFloat();
                float perpendHeight = input.nextFloat();
                System.out.println("The Area of Parallelogram is " + (base1 * perpendHeight));
                break;
            case 5:
                System.out.println("Enter side1 and side2");
                float side1 = input.nextFloat();
                float side2 = input.nextFloat();
                System.out.println("Area of Rhombus is " + (05*side1*side2));
                break;
            case 6:
                System.out.println("Enter the side");
                float side = input.nextFloat();
                System.out.println("The Area of Equilateral Triangle is " + ((Math.sqrt(3)/4* side * side )));
                break;
            default:
                System.out.println("Choose the corect option");
        }
        
        input.close();

    }
}
