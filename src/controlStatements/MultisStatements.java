package controlStatements;

public class MultisStatements 
{

	public static void main(String[] args) 
	{
		/*if(true) //we can directly pass boolean values instead of expression
		{
			System.out.println("Entry");
		}
		else                
		{                                     
			System.out.println("Exit");
		}
		if (1==2)
		{
			System.out.println("Entry");
		}
		else                
		{                                     
			System.out.println("Exit");
	}*/
		if(false) //nested if conditions
		{
			if(true)
			{
				System.out.println("Entry");
			}
			else
			{
				System.out.println("Exit");
			}
		}
		else
		{
			System.out.println("No Entry");
		}
		}

}
// Dead Code means code that is written but never executed,and thus has no effect on the program’s behavior
