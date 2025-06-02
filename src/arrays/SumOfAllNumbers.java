package arrays;
//Write a program to calculate the sum of all elements in an integer array.
public class SumOfAllNumbers {
//WAP to find sum of array elements
	
	public static void main(String[] args) 
	{
		int num[]= {1,8,3,6,9,10,11};   //initialize
		int sum=0;
	    
		for(int i=0;i<=num.length-1;i++)
		{
		  sum=sum+num[i];
		}
	    
	    System.out.println("Sum of all numbers= "+sum);
		
		
		//int num2=num[0];
		//System.out.println(num2);
		/*int a=1;
		int b=2;
		int c=3;
		int sum=a+b+c;
		System.out.println(sum);*/
		
		/*for(int i=0;i<7;i++)
		{
			if(num2<num[i])
			{
				num2=num[i];
			}}
		System.out.println(num2);*/
			
	}
		
		
		
		

}
