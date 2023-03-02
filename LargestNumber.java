import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num = 1;
        int max = Integer.MIN_VALUE;
        while(num != 0){
            System.out.println("Enter the Number : ");
            num = input.nextInt();
            if(max<num){
                max = num;
            }
        }
        System.out.println("The maximum number is " + max);
        input.close();
    }
}
