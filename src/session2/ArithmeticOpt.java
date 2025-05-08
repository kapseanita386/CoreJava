package session2;


public class ArithmeticOpt
{
	public static void main(String args[])

{
	
	int pen=10 ,books=10,PriceOfPen=10,PriceOfBook=10;
	float discount=5;
	int TotalPriceOfPen = pen*PriceOfPen;
    int TotalPriceOfBook = books*PriceOfBook;
    float Total = (TotalPriceOfPen+TotalPriceOfBook);
    float Discountamount = (Total*discount)/100;
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
