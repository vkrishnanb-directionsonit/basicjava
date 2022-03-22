package edu.lessons.day32.statements;
public class DemoC {

	public static void test() 
	{
		
		 m4();
		
	}
	
    public static void m1()
    {
        outer:
        for(int i=0;i<2;i++)
        {
           for(int j=0;j<3;j++)
           {
               if(j>1) break ;                    
               System.out.println("i "+ i + " j "+j);
           }
        }
    }
    
    public static void m2()
    {
    	labelA:
    	for(int i=0;i<3;i++)
    	{
    	    for(int j=0;j<2;j++)
    	    {
    	        System.out.println("i="+i + " j= "+j);
    	        if(i >0)  break labelA;// break the outer loop
    	    }
    	    System.out.println("Continuing with i set to ="+i);
    	}    
    	System.out.println("After the For loop");
    }
	public static void m3()
	{
		int i=0;
	    while(i<10)
	    {
            System.out.println("\t Value of i: "+i);
            i++;
	    }
	    System.out.println("**********After While Loop");
        do{
            System.out.println("\t"+i);
            i++;
         } while (i <12);
	}
	public static void go()
	{
	    int z=0;
	    for(int i=0;i<10; i++,z++)
	    {
	        System.out.println(z);
	    }
	    for(;;)
	    {
	        System.out.println("go");
	    }
	}
	/*
	// Without break
	i =1
		before i=1
		inner
		i=1 , j=1
		i=1, j=2
		After i=1
	i=2
		Before i=2
		inner
		i=2 ,j=1
		i=2, j=2
		After i=2
	i=3
	After For Loop	
	======================
	// continue
	outer:
	i =1
		before i=1
		inner
		Before j=1, 
		-- Value i=1 , j=1
		Before j=2, 
	i=2
		Before i=2
		inner
		Before j=1,
		-- Value i=2 ,j=1
		Before j=2, 	
	i=3
	After For Loop	
	======================
	// break
	outer:
	i =1
		before i=1
			inner
			Before j=1, 
			-- Value i=1 , j=1
			Before j=2,
		After i=1
	i=2
		Before i=2
			inner
			Before j=1,
			-- Value i=2 ,j=1
			Before j=2, 
		After i=2		
	i=3
	After For Loop
	*/	
	public static void m4()
	{
        int i;
        int j;
      outer:
        for (i=1;i <3;i++)
        {
        	System.out.println("Before i="+i);
          inner:
        	for(j=1; j<3; j++) 
        	{
        		System.out.println("\tBefore Continue j="+j);
        		if (j==2) break;//continue outer; //
        		System.out.println("\t---Value for i=" + i + " Value for j=" +j);
        	}
            System.out.println("After Continuing with i ="+i);
        }        
        System.out.println("After For Loop");
	}


}