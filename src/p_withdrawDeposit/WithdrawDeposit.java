package p_withdrawDeposit;

import java.util.Scanner;

public class WithdrawDeposit {
    public static void main(String[] args) {
        System.out.println("Enter Balance:");
        Scanner scanner = new Scanner(System.in);
        int balance = scanner.nextInt();
        System.out.println("1.Withdraw\n2.Deposit\n3.View Balance\nEnter choice:");
        int choice = scanner.nextInt();
        int cash, amt;
            switch (choice)
            {
                case 1:
                    System.out.println("Withdraw");
                    System.out.println("Enter Cash to withdraw:");
                    cash = scanner.nextInt();
                    if (balance < cash) {
                        System.out.println("Insufficient Balance");
                    }
                    else if (cash%100!=0)
                    {
                        System.out.println("Cash Should be multiple of 100");
                    }
                    else
                    {
                        amt = balance - cash;
                        System.out.println("Available Balance is " + amt);
                    }
                    break;
                case 2:
                    System.out.println("Deposit");
                    System.out.println("Enter Cash to deposit:");
                    cash = scanner.nextInt();
                    if (cash>30000)
                    {
                        System.out.println("Cash limit Should be less than 30000");
                    }
                    else
                    {
                        amt = balance + cash;
                        System.out.println("Current Balance is " + amt);
                    }
                    break;
                case 3:
                    amt = balance;
                    System.out.println("Current balance is " + amt);
                    break;

                default:
                    System.out.println("Invalid choice entered");
                    break;

            }
    }
}
// if (balance<=0)
// {
//     System.out.println("Invalid ammount transation");
// }
// else
// {
//    System.out.println("Insufficient Balance");
// }