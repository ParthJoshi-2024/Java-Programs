import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        // Input a number and print all the factors of that number (use loops).
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        System.out.println("The Factors of " + num + " are ");
        for(int i = 1;i<=num;i++){
            if(num%i == 0){
                System.out.println(i);
            }
        }
        input.close();

    }
}
