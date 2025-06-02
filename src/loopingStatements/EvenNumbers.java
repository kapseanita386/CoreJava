package loopingStatements;
//WAP to find out Even numbers between 1 to 10 numbers using while loop

public class EvenNumbers 
{

	public static void main(String[] args) 
	{
		
		/* Approch 1
		int i=2;
		
		while(i<=10) 
		{
			System.out.println(i);
			i=i+2;
			
		}*/
		
		//Approach 2
		
		/*int i=1;
		while(i<=10) 
		{
			if(i%2==0) 
			{
				System.out.println(i);
			}
			i++;
		}*/
		//Approach 3
		int i=1;
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println("Number is Even"+i);
			}
			else
			{
				System.out.println("Number is Odd"+i);
			}
			
			i++;
		
		}
		

	}

}
