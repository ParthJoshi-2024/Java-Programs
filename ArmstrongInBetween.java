import java.util.Scanner;
public class ArmstrongInBetween {
    static boolean isArmstrong(int num){
        int digit = 0;
        int num1 = num;
        int sum = 0;
        while(num>0){
            digit++;
            num = num/10;
        }
        num=num1;
        while(num!=0){
        sum = sum + (int)Math.pow(num % 10, digit);
        num = num/10;
        }
        if(sum == num1){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        for(int i = num1; i<=num2; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
        input.close();
    }
}