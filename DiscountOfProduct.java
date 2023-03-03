import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Selling Price of the Product");
        float price = in.nextFloat();
        float discount;
        System.out.println("Enter the discount ");
        discount = in.nextFloat();
        System.out.println("The Final Price after the discount is "  +  (price - discount));
        
        
        in.close();

    }
}
