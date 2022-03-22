package edu.lessons.day95.listeners.acc;

public class TransClient
{
  public static void main(String args[])
  {
     Account acc =new Account();
     MessageCreater msg=new MessageCreater();
     acc.setListener(msg);
     acc.updateBalance(45000);
     acc.updateBalance(-8000);
     acc.updateBalance(210000);

  }
}