package edu.lessons.day38.arrays;
class ArraysDemoB <T>
{ 
	int currentSize=15;
    int currentIndex=0;
	T[] dataStore=null;
	@SuppressWarnings("unchecked")
	public ArraysDemoB()
	{
		dataStore=(T[]) new Object[this.currentSize];
	}
	@SuppressWarnings("unchecked")
	private  T[] increaseArraySize(T[] data)
	{
		int defaultlength=10;
		int len=data.length;
		int newlen =len+defaultlength;
		T[] tempArray=(T[])new Object[newlen];
		for(int i=0;i<len;i++)
		{
		  tempArray[i]=data[i];
		}
		return tempArray;
	}
	public void push(T obj) 
	{
	  if(currentIndex==currentSize) 
	  {
		  dataStore=increaseArraySize(dataStore);
		  currentSize=dataStore.length;
	  }
		dataStore[currentIndex]=obj;
		currentIndex++;
	}
	 
	public String toString() {
		if(dataStore.length==0){
			return null;
		}
 
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<dataStore.length; i++){
			sb.append(dataStore[i] + ", ");
		}
 
		sb.setLength(sb.length()-2);
		return sb.toString();	
	}
  public static void main(String args[]) 
  {
	  ArraysDemoB<Integer> d1=new ArraysDemoB<Integer>();
	  
	  for(int i=0;i<10;i++)
	  {
		  d1.push((int)(Math.random()*100));
	  }
	  System.out.println("["+d1+"]");
	  
	  for(int i=11;i<26;i++)
	  {
		  d1.push((int)(Math.random()*100));
	  }
	  System.out.println("["+d1+"]");
  }
}
