import java.util.Scanner;

public class BankingSystem { 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to the Banking System");
        System.out.println("Enter the Username");
        String name = sc.nextLine();
        float withdrawn;
        System.out.println("Enter the password");
        float amount = 0;
        String pass = sc.next();
        int choice;
        if(pass.equals("1234")){
            do{
            System.out.println("Welcome " + name);
            System.out.println("Enter the choice");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw" + "\n" + "3. Balance \n 4. For Exit");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Welocme to the Deposit Section");
                    System.out.println("Enter the Amount to be deposit");
                    amount = sc.nextFloat();
                    System.out.println("The AMount is " + amount);
                    break;
                case 2:
                    System.out.println("Welocme to the user Section");
                    System.out.println("Enter the amlount to be withdrawn");
                    withdrawn = sc.nextFloat();
                    if(withdrawn>amount){
                    System.out.println("Enter the correct amount");        
                    }
                    else{
                    System.out.println("The amount withdrawn is " + withdrawn);
                    System.out.println("The LEft Balance is " + (amount = amount-withdrawn));
                    }
                    break;
                case 3:
                    System.out.println("Welocme to the Balance Section");
                    System.out.println("The AMount is " + amount);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Enetr the correct choice");

            }
        }while(choice != 4);
    }
        else{
            System.out.println("Your Password is incorrect.");
        }
        sc.close();
    }
}