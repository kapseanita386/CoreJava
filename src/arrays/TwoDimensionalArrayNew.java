package arrays;

public class TwoDimensionalArrayNew {

	public static void main(String[] args) 
	
	{
		/*int a[][]=new int [3][2];  //declaration
		
		int a[0][0]=10;         //Declaration
		int a[0][1]=20;
		int a[1][0]=30;
		int a[1][1]=40;
		int a[2][0]=50;
		int a[2][1]=60;*/
		
		int a[][]= {{10,20},
				    {30,40},
				    {50,60}};
		
		//Find Size of two dimentional an array
		System.out.println("Length of row"+a.length);//size of row
		System.out.println("Length of column"+a[0].length); //size of coloumn
		//Read single value from column
		 System.out.println(a[1][1]);
		 System.out.println(a[2][0]);
		//How to Read all the rows and all the columns from the table using Normal for loop
		 
		 for(int r=0;r<=2;r++) 
		 {
			 for(int c=0;c<=1;c++) 	
			 {
				 System.out.println(a[r][c]);
			 }
		 }
		
		
		
		
	}

}
