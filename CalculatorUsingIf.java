import java.util.Scanner;
public class CalculatorUsingIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Choose the operation you want to Perform");
        System.out.println(" + , - , / , * ");
        char op = input.next().charAt(0);
        if(op == '+')
            System.out.println("The result is " + (a+b));
        else if(op == '-')
            System.out.println("The result is " + (a-b));
        else if(op == '*')
            System.out.println("The result is  " + (a*b));
        else if(op == '/')
            System.out.println("The result is " + (a/b));
        else
            System.out.println("Enter the correct operator");
            input.close();
    }
}
