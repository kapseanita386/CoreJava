package arrays;
//WAP to write table of 2

public class SimpleArray {

	public static void main(String[] args) 
	{
		/*int constDigit=2;
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(constDigit*i);
		}
		
		
		//System.out.println(a[i]);*/
		
		int multiple[]={1,2,3,4,5,6,7,8,9,10};
		int constDigit=2;
		int table;
		for(int i=0;i<=9;i++)
		{
			table=constDigit*multiple[i];
			System.out.println(table);
		//	System.out.println(constDigit*multiple[i]);
		}
		}

}
