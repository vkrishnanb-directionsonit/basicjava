package edu.lessons.day60.oops.abstractclass;

public abstract class AbsSpellchecker implements ISpelling
{
	public AbsSpellchecker()
	{
		System.out.println("ABstract Class Instantiated "+hashCode());
	}
	public void display()
	{
		System.out.println("AbsSpelling.display");
	}
	public int doWordCount(String para)
	{
		return para.split(" ").length;
	}
	public boolean doSpellCheck(String word){ return false;}
	public boolean doGrammerCheck(String word) { return false;}
}
