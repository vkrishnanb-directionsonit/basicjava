package edu.lessons.day60.oops.abstractclass;

public class EngSpelling extends AbsSpellchecker 
{
	public EngSpelling()
	{
		System.out.println("Eng Spelling created "+hashCode());
	}
	@Override
	public boolean doSpellCheck(String word) {
		System.out.println("Eng Spelling.doSpellcheck");
		return false;
	}
	@Override
	public boolean doGrammerCheck(String word) {
		System.out.println("Eng Spelling.doGrammerCheck");
		return false;
	}
}
