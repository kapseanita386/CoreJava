package arrays;

public class SingleDimentionalArray {

	public static void main(String[] args) 
	{
		/*int a[]=new int[4];   
		 * int []a=new int[4];   
    	//int a[]={10,20,30,40}
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;*/
		int a[]= {10,20,30,40,50};
	        //find length of an array
		System.out.println("Length of an array"+a.length);
		
		//Reading single value from an array
		
		//System.out.println(a[2]);
		
		//how to Retrieve data from array if we have 100 values 
		
		/*Normal For loop
		for(int i=0;i<a.length;i++)	//	i<=a.length-1
		{
			System.out.println(a[4]);
		}*/
		
		//Enhanced for Loop/for each...loop
		for(int x:a)
		{
			System.out.println(x);
		}

	}

}
