package loopingStatements;

public class ContinueStatements {

	public static void main(String[] args)
	{
		/*for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}*/
		for(int i=1;i<=10;i++)
		{
			if(i==3 || i==5 || i==9)  //skipping 3,5,9 and jump to the next
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
