import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        // Factorial of a number
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int fact = 1;
         int num = input.nextInt();
        if(num<0){
            System.out.println("Enter the valid integer to find its factorial.");
        }
         while(num !=0){
            fact = fact * num;
            num = num-1;
        }
        System.out.println("The factorial is " + fact);

        
        input.close();;

    }
}