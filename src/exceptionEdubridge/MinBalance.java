package exceptionEdubridge;

import java.util.Scanner;

//public class MinBalance
//{
public class MinBalance extends Exception
    {
        //	String msg;
        public MinBalance(String msg)
        {
            super(msg);
//		this.msg=msg;
        }
//	@Override
//	public String toString() {
//
//		return msg;
//	}
    }
    class BankingException {
        static int balance=1000;

        public static void main(String[] args) throws MinBalance {

            Scanner sc=new Scanner(System.in);
            System.out.println("enter amount to withdraw");
            int amount=sc.nextInt();
            try {


                if(balance<amount)
                {
                    throw new MinBalance("insufficient balance! your balance is: "+balance);
                }
                else
                {
                    System.out.println("plz take money: "+amount);
                }
            }
            catch(MinBalance e)
            {
                System.out.println(e);
            }
        }

    }

