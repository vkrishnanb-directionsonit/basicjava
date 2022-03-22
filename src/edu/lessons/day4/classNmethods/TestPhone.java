package edu.lessons.day4.classNmethods;

public class TestPhone {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

Phone p1=new Phone(123456789);
/*p1.phoneno=9658446;
p1.model="XPERIA";
p1.plan="prepaid";
p1.type="android";
*///p1.dateofpurchase="25/09/2010";
/*p1.colour="black";
p1.owner="ram";
p1.camera="21";
p1.os="lollipop";
p1.memory="16GB memory";
*/
p1.makeacall(9584566);
p1.receiveacall(7584856);
p1.sendsms(6589559,"hi");
p1.receivemsg(985685685,"hello");
p1.addcontact(9022325,"KRISH");
p1.findcontact(25648795);
p1.removecontact(75869548);

	}

}
