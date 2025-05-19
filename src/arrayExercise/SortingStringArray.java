package arrayExercise;

import java.util.Arrays;

public class SortingStringArray {

	public static void main(String[] args)
	{
		
		char c[]= {'z','a','M','U'};
		
		System.out.println("Before Sorting Char Array..." +Arrays.toString(c));
		Arrays.sort(c);
		System.out.println("After Sorting Char Array..." +Arrays.toString(c));
		System.out.println("");
		String s[]= {"Vrushali","Arnav","Ovi","Ishan","Omkar"};
		
		System.out.println("Before Sorting String Array..." +Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("After Sorting String Array..." +Arrays.toString(s));
	}

}
