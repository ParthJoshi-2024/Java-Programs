import java.util.Scanner;

public class AverageOfN_Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want to enter");
        int n = input.nextInt();
        System.out.println("Now enter the numbers one by one");
        float sum = 0.0f;
        int num;
        for(int i=1;i<=n;i++){
            num = input.nextInt();
            sum = sum + num;
        }
        System.out.println("The Average of " + n + " numbers is " + (sum/n));

        input.close();
    }
}
