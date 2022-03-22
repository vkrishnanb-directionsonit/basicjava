package edu.lessons.day4.classes;
public final class ScoreBoard
{
	private int currentScore;
	private int runRate;
	private static final ScoreBoard sb=new ScoreBoard();
	
	private ScoreBoard(){}
	
	public static ScoreBoard getScoreBoard()
	{
		return sb;
	}
	public void setScore(int runs)
	{
		System.out.println("Score Set ");
		//sb=new ScoreBoard();
		currentScore=runs;
    }
    public int getScore()
	{
	 	return currentScore;
    }
    public void setRunrate(int runs)
	{
	 	System.out.println("Runrate Set ");
	 	runRate=runs;
	 }
	 public int getRunrate()
	 {
	 	 return runRate;
     }
     public void display()
     {
		 System.out.println("Inside Display ");
		//sb=new ScoreBoard();
	 }
}
