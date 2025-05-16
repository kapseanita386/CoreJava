package arrays;
/*You are building a Sales Tracking System for a store. 
The store records the sales of each day in a week(7 days), and the manager wants to find out 
which day had the highest sales.write program with using array*/


public class FindLargestNumber 
{

	public static void main(String[] args)
	{
		int sale[]= {10,220,30,140,50,60,70};
		
		String days[]= {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		
		int highestsale=sale[0];
		
		String highestday=days[0];
		
		
		for(int i=0;i<7;i++)
		{
		   if(sale[i]>=highestsale)
		   {
			   highestsale=sale[i];
			   highestday=days[i];
		   }
		   
		   }
		System.out.print(highestday+" "+highestsale);
		
		
		

	}

}
