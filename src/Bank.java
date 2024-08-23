import jdk.dynalink.NamedOperation;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Account account=null;
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("1.Create Account");
            System.out.println("2.Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4.Details");
            System.out.println("5.Exit");
            System.out.print("enter an option:  ");
            int opt=scanner.nextInt();
            switch (opt){
                case 1:// create account
                    if (account == null){
                        System.out.println("Enter Account Number: ");
                        long accno=scanner.nextLong();
                        scanner.nextLine();
                        System.out.println("Enter Account Holder's Name:");
                        String name=scanner.nextLine();
                        System.out.println("Enter initial deposite:  ");
                        float amt=scanner.nextFloat();
                        account=new Account(accno,name, amt);
                        System.out.println("ACCOUNT CREATED!");
                        System.out.println("--------------------");

                    }
                    else{
                        System.out.println("FYI :  Account is Already Created!");

                    }
                    break;
                case 2: //deposite
                   if(account !=null){
                       System.out.println("enter amount to deposit:  ");
                       float amt=scanner.nextFloat();
                       account.deposit(amt);
                   }
                   else {
                       System.out.println("FYI  : Create Account First!");
                   }
                    break;
                case 3: //withdrawal
                    if (account != null){
                        System.out.println("enter amount to withdraw:  ");
                        float amt=scanner.nextFloat();
                        account.withdraw(amt);
                    }
                    else {
                        System.out.println("FYI : Create Account First!");
                    }
                    break;
                case 4: //details
                    if (account !=null){
                        account.getBalance();
                    }
                    else {
                        System.out.println("FyI : Create Account First!");
                    }
                    break;
                case 5: //terminate application
                    break;

            }

        }
    }
}
