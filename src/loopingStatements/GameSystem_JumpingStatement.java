package loopingStatements;

public class GameSystem_JumpingStatement 

{

	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			if(i==3)
			{
				System.out.println("it's locked or under maintenance");
				continue;
			}
			System.out.println("Level "+i);
			if(i==6)
			{
				System.out.println("stop the game");
				break;
			}
			 
		}

	}

}
