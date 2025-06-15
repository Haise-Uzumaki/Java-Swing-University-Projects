import java.util.Scanner;

public class Banking {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

         // JAVA BANKING PROGRAM

        // DECLARE VARIABLES
        
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){

        System.out.println("***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        // GET AND PROCESS USERS CHOICE
        System.out.print("Enter Your Choice(1-4): ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1 -> showBalance(balance);
            case 2 -> balance += deposit();
            case 3 -> balance -= withdraw(balance);
            case 4 -> isRunning = false;
            default -> System.out.println("INVALID CHOICE");
        }

        }


        // DISPLAY MENU 
        

        

        // showbalance()

        // deposit()
    
        //withdraw()
    
        // EXIT MESSAGE
        System.out.println("Thank You! Have A Nice Day <3");


        scanner.close();

    }

    static void showBalance(double balance) {
        System.out.println("**************************");
        System.out.printf("$%.2f\n", balance);
    }

    static double deposit() {

        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount cant be negative");
            return 0;
        }
        else {
            System.out.println("You have deposited " + amount + "$");
            return amount;
        }

        
    }
   
    static double withdraw(double balance) {

        double amount;

        System.out.println("Enter Amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient Fund");
            return 0;
        }
        else if (amount < 0) {
            System.out.println("Amount cant be negative!");
            return 0;
        }

        else {
            return amount;
        }

        
    }
    
}
