import java.util.Scanner;

public class ATM
{

    public static void main(String args[] )
    {
        //Here Im just declare and initialize balance, withdraw, and deposit
        int balance = 5000, withdraw, deposit;

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("\n");
            System.out.println("--------------------ATM MACHINE--------------------\n");
            System.out.println("Enter 1 for \"WITHDRAW\"");
            System.out.println("Enter 2 for \"DEPOSIT\"");
            System.out.println("Enter 3 for \"CHECK BALANCE\"");
            System.out.println("Enter 4 for \"EXIT\"\n");
            System.out.print("Choose the operation:");

            //get choice from user
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = sc.nextInt();
                    //check whether the balance is greater than or equal to the withdrawal amount
                    if(balance >= withdraw)
                    {
                        //remove the withdrawl amount from the total balance
                        balance = balance - withdraw;
                        System.out.println("\n\n---------------Please collect your money---------------");
                    }
                    else
                    {
                        //show custom error message
                        System.out.println("----------------Insufficient Balance---------------");
                        System.out.println("\n\nplease check your Balance");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");
                    deposit = sc.nextInt();
                    //add the deposit amount to the total balanace
                    balance = balance + deposit;
                    System.out.println("\n\n---------------Your Money has been successfully depsited---------------");
                    System.out.println("");
                    System.out.println("Check your balance using \"CHECK BALANCE\"");
                    break;

                case 3:
                    //displaying the total balance of the user
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 4:
                    //exit from the menu
                    System.exit(0);
            }
        }
    }
}