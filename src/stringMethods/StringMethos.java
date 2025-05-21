package stringMethods;

public class StringMethos
{

	public static void main(String[] args) 
	{
		//Approach 1
		//String s="welcome";
		String s=new String("Welcome");
		s.length();
		System.out.println("Length of string= "+s.length());
		//System.out.println("Welcome".length());
		
	//	System.out.println(s);
		// Concat()-Joining two string 
		String s1=new String("Wecome");
		String s2=new String(" to Java class");
		String s3=new String(" Automation");
		//System.out.println(s1+s2);
		
		System.out.println(s1.concat(s2).concat(s3));; //concat more than two strings
		
	}
	

}
