package edu.lessons.day1.introduction;


public class DemoArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length>0)
		{
			if(args[0]!=null && args[1]!=null)
				System.out.println(args[0]+" " + args[1]);
			if(args[2]!=null && args[3]!=null)
				System.out.println(args[2]+" " + args[3]);
		}
	}

}
// java DemoArgs Priyanga Joe Chennai Nov 