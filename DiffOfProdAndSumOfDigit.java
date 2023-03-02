import java.util.Scanner;

public class DiffOfProdAndSumOfDigit {
    static int sumOfDigits(int num){
        int sum = 0;
        while(num!=0){
            sum = sum + num%10;
            num = num/10;
        }   
        return sum;
    }

    static int prodOfDigits(int num){
        int product = 1;
        while(num!=0){
            product = product * (num%10);
            num = num/10;
        }
        return product;
    }
    public static void main(String[] args) {
        // Subtract the Product and Sum of Digits of an Integer
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Integer Number");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        int product = prodOfDigits(num);
        System.out.println("The Diffrence of product and sum of digits of an Integer Number is " + (product-sum));
        input.close();


    }
}
