import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {

        BankAccount obj = new BankAccount("Mohamed", "mow155556");
        obj.showMenu();

    }
}
class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;
    public BankAccount(String cname, String cid) {
        //TODO Auto-generated constructor stub
        customerName = cname;
        customerID = cid;
    }
    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;


        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = amount;
        }
    }
    void getPreviousTransaction(){
        if(previousTransaction > 0) {
            System.out.println("Deposited:" + previousTransaction);

        }
        else if (previousTransaction < 0) {
            System.out.println("Withdraw: " + Math.abs(previousTransaction));
        }
        else {
            System.out.println("No Transaction Occurred");
        }
    }
    void showMenu() {
      char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your ID " + customerID);
        System.out.println("\n");
        System.out.println("A: Check Your you balance");
        System.out.println("B: Deposit");
        System.out.println("C: Withdraw");
        System.out.println("D: Previous Transaction");
        System.out.println("E: Exit the System");
        System.out.println("\n");

        do {
            System.out.println("=*=*=*=*=*=*=*=*=*");
            System.out.println("Enter your option");
            System.out.println("=*=*=*=*=*=*=*=*=*=*");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.print("-----------------------");
                    System.out.print("Balance = " + balance);
                    System.out.print("-----------------------");
                    System.out.print("\n");
                    break;


                case 'B':
                    System.out.print("-----------------------");
                    System.out.print("Enter an Amount to Deposit");
                    System.out.print("-----------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);

                    System.out.print("\n");
                    break;

                case 'C':
                    System.out.print("-----------------------");
                    System.out.print("Enter an Amount withdraw");
                    System.out.print("-----------------------");

                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.print("\n");
                    break;

                case 'D':
                    System.out.print("-----------------------------");
                    getPreviousTransaction();
                    System.out.print("-----------------------------");
                    System.out.print("\n");
                    break;

                case 'E':
                    System.out.print("===============");
                    break;


                default:
                    System.out.println("invalid option! Please enter correct pin ...");
                    break;
            }

        }
        while (option != 'E');
        System.out.println("Thank you for using our Services ....");
    }
}
