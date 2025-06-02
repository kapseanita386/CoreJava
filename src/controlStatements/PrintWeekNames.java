package controlStatements;

public class PrintWeekNames {

	public static void main(String[] args) 
	{
		int weeknum=3;
		if(weeknum==1)
		{
			System.out.println("Sunday");
		}
		else if(weeknum==2)
		{
			System.out.println("Monday");
		}
		else if(weeknum==3)
		{
			System.out.println("Tuesday");
		}
		else if(weeknum==4)
		{
			System.out.println("Wednesday");
		}
		else if(weeknum==5)
		{
			System.out.println("Thirsday");
		}
		else if(weeknum==6)
		{
			System.out.println("Friday");
		}
		else if(weeknum==7)
		{
			System.out.println("Saturday");
		}
		else 
		{
			System.out.println("Invalid week number");
		}
	}

}
