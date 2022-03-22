package edu.lessons.day95.listeners.acc;

public class MessageCreater implements AccountListener
{
  public void sendBalanceChangedMsg(int accNo, double oldBal,double amt)
  {
    double newBal=oldBal+amt;
    System.out.print("Your Account# "+ accNo +"\n Balance has been changed from "+oldBal +"\n By "+ amt);
    System.out.println("-- New Balance="+newBal);
  }
  public void   requestPANMsg(int accNo,double oldBal,double amt)
    {
      System.out.print("You Need PAN for Transactions above Rs 50000/-");
      System.out.println("\n-- Trans Amt="+amt);
  }
  public void   sendMsg2IncomeTax(int accNo,double oldBal,double amt)
    {
      double newBal=oldBal+amt;
      System.out.print("Account# "+ accNo +"\n has Balance more than Rs200000/-");
      System.out.println("\n-- New Balance="+newBal);
  }
}
