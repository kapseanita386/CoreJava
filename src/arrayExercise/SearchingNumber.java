package arrayExercise;

public class SearchingNumber {

	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,50};
		int search_element=50;
		
		boolean status=false;
		for(int i=0; i<=a.length-1;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("element found");
				status=true;
				break;
			}
			
		}
		if (status==false)
		{
			System.out.println("element notfound");
		}
		
		
		/*for(x:a)
		{
		if(x==search_element)
		{
		System.out.println("element notfound");
		}*/
		
	}

}
