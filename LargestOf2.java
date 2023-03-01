import java.util.Scanner;

public class LargestOf2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the two numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();
        if(num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        }
        else
            System.out.println(num2 + " is greater than " + num1);
        input.close();
    }
}
