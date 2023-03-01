import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number to get checked whether it is even or odd");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number " + num + " is even");

        } else {
            System.out.println("The Number " + num + " is odd");
        }

        input.close();
    }
}
