package edu.lessons.day60.oops.abstractclass;

public class TestAbsSpelling {
	public static void main(String[] args) 
	{
		//AbsSpellchecker abs=new AbsSpellchecker();
		ISpelling abs=new EngSpelling();
		boolean flag=abs.doSpellCheck("Helloi");
		System.out.println("Result "+flag);
		String str="Its a wonderful morning if it is cloudy and cool. Hope the rain doesnt spoil the day";
		System.out.println("Word Count "+abs.doWordCount(str));
		
		abs=new TamilSpelling();
		flag=abs.doSpellCheck("Vannakkam");	
		System.out.println("Result "+flag);
		
	}
}
