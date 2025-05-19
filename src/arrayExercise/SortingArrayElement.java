package arrayExercise;

import java.util.Arrays;

public class SortingArrayElement {

	public static void main(String[] args)
	{
		int a[]={200,500,100,50,300,700};
		
		System.out.println("Before Sorting...");
		
		System.out.println(Arrays.toString(a));//Just printing the array element 
		
		Arrays.sort(a); //Predefine method in java
		
		System.out.println("After Sorting...");
		System.out.println(Arrays.toString(a));
		
		
		
		
		/*for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(+a[i]);
		}
		System.out.println("After Sorting...");
		{
			
		}*/
	}

}
