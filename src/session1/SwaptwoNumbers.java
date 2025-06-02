package session1;

public class SwaptwoNumbers {

	public static void main(String[] args) 
	{
		int a=12;
		int b=17;
		int c;
		
	   //Method1
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		//Method2
		/*a=a*b;
		  b=a/b;
		  a=a/b;*/
		c=a;
		a=b;
		b=c;
		
		
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		
		

	}

}
