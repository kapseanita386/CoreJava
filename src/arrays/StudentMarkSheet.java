package arrays;


public class StudentMarkSheet 
{

	public static void main(String[] args) 
	{
		int marks[][]= {{80,80,60,70},
				        {60,90,80,70},
				        {70,90,70,60},
				        };
		String subjects[][]= {{"Maths","Sci","Eng","History","total"}};
		String studentN[][]= {{"S1"},{"S2"},{"S3"}};
		int total=0;
		
		for(int i=0;i<=4;i++)
		{
			System.out.print( " " +subjects[0][i]);
			
		}
		System.out.println();
		
		
		for(int r=0;r<=2;r++)
		{
			System.out.print(studentN[r][0] +" ");
			for(int c=0;c<=3;c++)
			{
				
				System.out.print("  "+marks[r][c]);
				
				total=total+marks[r][c];
				
			}
			
			System.out.println("  "+total);
			System.out.println();
			
			
			
			
		}
		
		
		
	}
}
