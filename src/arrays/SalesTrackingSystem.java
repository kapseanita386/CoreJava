package arrays;

public class SalesTrackingSystem {

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

