package edu.lessons.day4.classes;
class TestSB
{
  public static void main(String args[])
  {
    try{
			//ScoreBoard oc=new ScoreBoard();
			ScoreBoard oc1= ScoreBoard.getScoreBoard();
			ScoreBoard oc2= ScoreBoard.getScoreBoard();
			ScoreBoard oc3= ScoreBoard.getScoreBoard();
			Integer runs=210;
			oc1.setScore(runs);
			oc1.setRunrate(5);
			System.out.println("oc2 Runs "+oc2.getScore()+" "+oc2.getRunrate());
			System.out.println("oc3 Runs "+oc3.getScore()+" "+oc3.getRunrate());

		}catch(Exception e)
		{
			System.out.println("Error "+e);
		}
	}
}