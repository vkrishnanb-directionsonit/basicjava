package edu.lessons.day95.listeners.acc;

public interface AccountListener
{
	public void sendBalanceChangedMsg(int accNo, double oldBal,double amt);
	public void requestPANMsg(int accNo,double oldBal,double amt);
	public void sendMsg2IncomeTax(int accNo,double oldBal,double amt);
}