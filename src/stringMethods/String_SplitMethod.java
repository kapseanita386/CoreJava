package stringMethods;

import java.util.Arrays;

public class String_SplitMethod 
{
	public static void main(String args[])
	{
		String s="abc123@gmail.com";
		
		String a[]=s.split("@");
		//System.out.println(Arrays.toString(a));
		//System.out.println(Arrays.toString(s.split("@")));
		//System.out.println(a[0]);
		//System.out.println(a[1]);
		
		//Ex1
		
		String amount="$5,20,25";
		
		System.out.println(amount.replace("$", "").replace(",", ""));
		
		//Ex2
		
		s="abc,123@xyz";  //Split this into three parts
		
		String arr1[]=s.split(","); // abc  123@xyz
		
		System.out.println(Arrays.toString(arr1)); //123@xyz
		
		String arr2[]=arr1[1].split("@");
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		//Ex3
		s="abc 123";
		String ar[]=s.split(" ");
		System.out.println(Arrays.toString(ar));
		
		// we can not use * % & ^ ( ) as a delimeters or seperator
		
		//Ex 4
		String name="Anita Kapse";
		//System.out.println(name.contains("kapse"));
		System.out.println(name.replace("K", "k").contains("Kapse"));
		}

}
