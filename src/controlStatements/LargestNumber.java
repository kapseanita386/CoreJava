package controlStatements;
//WAP to find out the largest number between three number
public class LargestNumber {

	public static void main(String[] args) 
	{
		int number1=10,number2=10,number3=103;
		
		
		if(number1>number2 && number1>number3)
		{
			System.out.println("Number1 is largest");
		}
		else if(number2>number1 && number2>number3)
		{
			System.out.println("Number2 is largest");
		}
		else if(number3>number1 && number3>number2)
		{
			System.out.println("Number3 is largest");
		}
		else 
		{
			System.out.println("All numbers are euals");
		}

	}

}
