import java.util.Scanner;
public class Electricity_bill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Electricity Units");
        double bill_value;
        int connection;
        int units = sc.nextInt();
        float fix_charge;
        System.out.println("Enter the Connection in KW the customer have : ");
        connection = sc.nextInt();
        if(connection == 1){
            fix_charge = 135;
            if(units<=100 && units >=0){
            bill_value = fix_charge + (units * 3.5);
            System.out.println("The electricity bill is " + bill_value);
            }
            else if(units>100){
                bill_value = fix_charge + (units * 6.5);
                System.out.println("The electricity bill is " + bill_value);
            }
            else{
                System.out.println("Enter the correct units of electricity");
            }
        }
        else if(connection == 2){
            fix_charge = 260;
            if(units<=100 && units >=0){
            bill_value = fix_charge + (units * 3.5);
            System.out.println("The electricity bill is " + bill_value);
            }
            else if(units>100){
                bill_value = fix_charge + (units * 6.5);
                System.out.println("The electricity bill is " + bill_value);
            }
            else{
                System.out.println("Enter the correct units of electricity");
            }
        }
        else if(connection >=3){
            fix_charge = 460;
            if(units<=100 && units >=0){
            bill_value = fix_charge + (units * 3.5);
            System.out.println("The electricity bill is " + bill_value);
            }
            else if(units>100){
                bill_value = fix_charge + (units * 6.5);
                System.out.println("The electricity bill is " + bill_value);
            }
            else{
                System.out.println("Enter the correct units of electricity");
            }
        }
        else{
            System.out.println("Enter the valid connection load.");
        }

        sc.close();
    }
}
