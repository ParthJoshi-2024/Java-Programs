import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = 0;
        int n;
        int n2 = 1;
        int n3;
        n3 = n1 + n2;
        System.out.println("Enter number of terms you want in the Fibonacci Series = ");
        n = input.nextInt();
        System.out.println("The Fibonacci Series is as :");
        if(n ==1){
            System.out.println(n1);
        }
        if(n==2){
            System.out.println(n1 + " " + n2);
        }
        if(n>2){
        System.out.println(n1);
        System.out.println(n2);
        for(int i = 1;i<=n-2;i++){
            n3 = n1 + n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
        input.close();
    }
   
    }
}
