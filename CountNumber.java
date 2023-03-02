import java.util.Scanner;
public class CountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        int rem;
        int target = 7;
        while(num!=0){
            rem = num % 10;
            if(rem == target){
                count++;
            }
            num  =num / 10;
        }
        System.out.println("The target number " + target + " is coming " + count + " times");
        input.close();
    }
}
