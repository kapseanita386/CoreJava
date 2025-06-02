package arrays;
/*1.Declare an Array
 2.Add values into array 
 3.Find length of an array
 4.Read single value an array 
 5.Read multiple values an array
 */
public class TwoDimentionalArray
{

	public static void main(String[] args) 
	{
		//declaring array  Approach1
		
		/*int a[][]=new int[3][2];
		//int [][]a=new int[3][2];
		//int []a[]=new int[3][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;*/
		
		//Approach 2
		int a[][]={
				{10,20},{30,40},{50,60}
				};
		//Find the size of an array
		System.out.println("Length of rows"+a.length);
		System.out.println("Length of colomns"+a[0].length);
		
         //Read a single value of an array
		//System.out.println(a[2][1]);
		/*for(int r=0;r<=2;r++)  //it represents row data
		{
			for(int c=0;c<=1;c++)//it represents columns data 
			{
				System.out.print(a[r][c]+"  ");
			}
			System.out.println();
		}*/
		// Approach 2 Enhanced for loop
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
	}
	
}
