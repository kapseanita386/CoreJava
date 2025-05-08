package session2;

public class StationaryItemBill 
{
	public static void main(String args[])
	{
		
		int items=100;
		float itemprice=25.20f, discount=10;
		
		float totalbillbeforediscount=items*itemprice;
		boolean discountapplicable=(totalbillbeforediscount>1000);
		
		float billwithdiscount=(totalbillbeforediscount-(totalbillbeforediscount*discount)/100);
		float discountEligible=(totalbillbeforediscount>1000)?billwithdiscount:totalbillbeforediscount;
		boolean freegift=((totalbillbeforediscount>1000) && (items>5));
		
		System.out.println("Number of Items = "+items);
		System.out.println("Price of one Item is ="+itemprice);
		System.out.println("Total Bill Amount before disscount is ="+totalbillbeforediscount);
		System.out.println("Discount applicable ="+discountapplicable);
		System.out.println("Final bill ="+discountEligible);
		System.out.println("FreeGift applicable ="+freegift);
		
		
		
				
		
	}

}
