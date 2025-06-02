package arrays;

public class ObjectArray {

	public static void main(String[] args) 
	{
		Object a[]= {1,'A',7.4,true}; //allow all kinds of data
		
		
	//How to read object type of data using Enhanced for loop
		/*for(Object x:a)
		{
			System.out.println(x);
		}*/
		//How to read object type of data using Normal for loop
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
