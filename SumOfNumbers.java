import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        // Take integer inputs till the user enters 0 and print the sum of all numbers
        Scanner input = new Scanner(System.in);
        /*
        int num;
        int total = 0;
        int copy;
        do {
            num = input.nextInt();
            copy = num;
            while(copy>0){
                total = total + copy%10;
                copy = copy/10;
            }
        } while (num>0);
        System.out.println(total);
        input.close();
*/  
        int num = 1,sum = 0;
        while(num != 0){
            
            System.out.println("Enter the number");
            num = input.nextInt();
            sum = sum + num;
        }
        System.out.println("The sum is " + sum);
        input.close();


    }
}
