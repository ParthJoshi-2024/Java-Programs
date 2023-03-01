import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String to check whether it is Pallindrome or not");
        String str = input.next();
        int n = str.length() - 1;
        String str1 = "";
        while(n >= 0){
            str1 = str1 + str.charAt(n);
            n--;
            
        }
        if(str1.equals(str)){
            System.out.println("The String is Pallindrome.");
        }
        else{
            System.out.println("The Sting is not Pallindrome.");
        }
        input.close();
    }
}
