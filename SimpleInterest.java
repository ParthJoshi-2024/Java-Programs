import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float prin, rate, time, si;
        System.out.println("Enter Principal, Rate and Time one by one ");
        prin = input.nextFloat();
        rate = input.nextFloat();
        time = input.nextFloat();
        si = prin * rate * time / 100;
        System.out.println("The Simple Interest is " + si);
        input.close();

    }
}
