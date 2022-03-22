package edu.lessons.day60.oops.abstractclass;

public class TamilSpelling extends AbsSpellchecker {

	public TamilSpelling()
	{
		System.out.println("TamilSpelling created "+hashCode());
	}
	@Override
	public boolean doSpellCheck(String word) {
		System.out.println("TamilSpelling.doSpellcheck");
		return false;
	}
	@Override
	public boolean doGrammerCheck(String word) {
		System.out.println("TamilSpelling.doGrammerCheck");
		return false;
	}
}
