import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        // Taking the Temperature in Celcius and then converting it into Fahrenheit
        Scanner input = new Scanner(System.in);
        float celcius = input.nextFloat();
        float fahrenheit = 1.8f * celcius + 32;
        // Old Taditional Way of Printing in C, also applicable in Java
        System.out.printf("Temperature in Fahrenheit is %f" , fahrenheit);
        System.out.printf("\n");
        // The new more advanced way of Printing in Java is below
        System.out.println("Temperature in Fahrenheit is " + fahrenheit);
        
        input.close();


        
    }
}
