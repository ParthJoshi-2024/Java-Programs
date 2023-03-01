import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        // If we want to take the input from the user in Java, then we have to use the Scanner class.
        Scanner object = new Scanner(System.in);
        System.out.println(object.next());
        System.out.println(object.nextInt());
        System.out.println(object.nextLine());
        // and many more types of methods are used for taking the input, these methods are called with the help of the object of the Scanner class.

        
        object.close();

    }
    
}
