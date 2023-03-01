import java.util.Scanner;

public class GreetingForInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  Name");
        String name = input.nextLine();
        System.out.println("Hey " + name + ". I am Happy to meet with you.\nI hope that you are well and good. Thank You");

        input.close();
    }
}
