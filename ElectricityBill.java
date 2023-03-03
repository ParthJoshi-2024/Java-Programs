import java.util.Scanner;


public class ElectricityBill {
    // static float fix_charge;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Electricity Units");
        double bill_value;
        int connection;
        int units = sc.nextInt();
        
        float fix_charge = 0;

        System.out.println("Enter the Connection in KW the customer have : ");
        System.out.println("1. for 1KW");
        System.out.println("2. for 2KW");
        System.out.println("3. for 3KW or more than 3KW");
        connection = sc.nextInt();
        switch(connection){
            case 1 : 
                fix_charge = 130;
                break;
            case 2:
                fix_charge = 260;
                break;
            case 3:
                fix_charge = 460;
                break;
            default :
                System.out.println("Enter the correct connection load.");
        }
        
        if(units <= 100 && units>0){
            bill_value = fix_charge + (units*3.0);
            System.out.println("The Electricity Bill is " + bill_value);

        }
        else if(units>100){
            bill_value = fix_charge + (units*6.5);
            System.out.println("The Electricity Bill is " + bill_value);
        }
        else{
            System.out.println("Enter the Valid units of electricity.");
        }
        sc.close();
    }
}
