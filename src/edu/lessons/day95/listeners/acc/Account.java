package edu.lessons.day95.listeners.acc;

public class Account
{
   private int     custNo=12345678;
   private int     accNo=11145677;
   private double  accBalance;
   private AccountListener listener;
   public void setListener(AccountListener al)
   {
		this.listener=al;
	}
   public void updateBalance(double amt)
   {
      double oldBal=accBalance;
      if(0==amt) return;
      accBalance +=amt;
      if(null!=listener)
      {
        listener.sendBalanceChangedMsg(accNo,oldBal,amt);
        if(amt>=50000)
      	  listener.requestPANMsg(accNo,oldBal,amt);
        if(accBalance>=200000)
			  listener.sendMsg2IncomeTax(accNo,oldBal,amt);
		}
   }
}