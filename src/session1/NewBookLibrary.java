package session1;

public class NewBookLibrary 
{
	public static void main(String args[])
	{
		
		String BookDetails = "Book Details:";
		String BookTitle = "Harry Poter";
		String AuthorName = "J.B.Rowling";
		int YearOfPublication = 1956;
	    float PriceOfBook = 500;
		String AvailabilityOfBook = "Yes";
		String MemberDetails = "Member Details:";
		String NameOfMember = "Anita";
		int MemberId = 001;
		char TypeOfMembership = 'A'; //A=Adult, C=child, S=Senior
		String BorrowingDetails = "Borrowing Details";
		int BorrowingPeriod = 1;
		float FinePerExtraDay = 10;
		int Nofine=0;
		int extradays= BorrowingPeriod-3;
		float fine=(extradays>=1)?extradays:Nofine;
		float TotalFine = FinePerExtraDay * fine;
		
		System.out.println(BookDetails);
		System.out.println("Book Title is : "+BookTitle);
		System.out.println("Author's Name is : " +AuthorName);
		System.out.println("Year Of Publication is : " +YearOfPublication);
		System.out.println("Price Of Book is : "+PriceOfBook);
		System.out.println("Availability Of Book is : " +AvailabilityOfBook);
		System.out.println();
		System.out.println(MemberDetails);
		System.out.println("Name Of the Member is : "+NameOfMember);
		System.out.println("Member Id is : "+MemberId);
		System.out.println("Type Of Membership is : "+TypeOfMembership);
		System.out.println();
		System.out.println(BorrowingDetails);
		System.out.println("Number of days the book has been borrowed : "+BorrowingPeriod);
		System.out.println("Number of extradays is = "+extradays);
		System.out.println("Fine Per extra Day is : "+FinePerExtraDay);
		System.out.println("Total Fine = "+TotalFine);
	}
}
