package session2;


public class ArithmeticOpt
{
	public static void main(String args[])

{
	
	int pen=10 ,books=15,PriceOfPen=25,PriceOfBook=75;
	
	float discount=5;
	int TotalPriceOfPen = 25*10;
    int TotalPriceOfBook = 75*15;
    float Total = (TotalPriceOfPen+TotalPriceOfBook);
    float Discountamount = (discount/100)*Total;
    float finalAmount= Total-Discountamount;
	
	System.out.println("Number of Pens is = "+pen);
	System.out.println("Number of Books is = "+books);
	System.out.println("Price of a Pens is = "+PriceOfPen);
	System.out.println("Price of a Book is = "+PriceOfBook);
	System.out.println("Total without discount is = "+Total);	
	System.out.println("Discount amount is = "+Discountamount);
	System.out.println("Total with discount is = "+finalAmount);
}

}
