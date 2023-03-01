import java.util.Scanner;

public class RupeesToDollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in Rupees");
        float rupees = input.nextFloat();
        float dollar = rupees / 82;
        System.out.println("The Amount in Dollar is $" + dollar);
        input.close();
    }
}
