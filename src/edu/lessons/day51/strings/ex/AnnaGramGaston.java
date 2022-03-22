package edu.lessons.day51.strings.ex;
public class AnnaGramGaston 
{
	public boolean isAnagram(String firstWord, String secondWord)
	{
		 int matchingLetters = 0 ;
		 if(firstWord.equals(secondWord)) return false;
		 
		 for(int i = 0 ; i<firstWord.length() ; i++)
		 { 
			 for(int j = 0 ;j<secondWord.length() ; j++)
			 {
				 if(firstWord.charAt(i) == secondWord.charAt(j))
				 {
					 matchingLetters++;
				 }
			 }
		 }
		 return matchingLetters == firstWord.length();
	}
	public void checkAnagram(String text){
		
		String [] allWords = text.split(" ");
		
	    for(int i = 0 ; i<allWords.length-1 ; i++){
	    	
	    	String s = allWords[i];
	    	
	    	for (int j = i+1 ; j<allWords.length ; j++){
	    		if ( allWords[j].length() == s.length()){
	    		
		    	  if(isAnagram(s,allWords[j])){
		    		 System.out.println("Anagram found : "+allWords[j]+" & "+s);
		    		
		    	  }
	    		}
	    	}
	    	
	    }
			
			
			
	}
	
	public static void main(String []args){
		AnnaGramGaston a= new AnnaGramGaston();
		String  sentence = "parts and strap 42 that ora aro  jack kcaj 54  i saw was 24 in the room 45 and  there are traps";
		a.checkAnagram(sentence);
	

	}
	
}

