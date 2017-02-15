package EnumExample;


/**
 * Enums are lists of constants. When you need a predefined list of values which do represent some kind of numeric 
 * or textual data, you should use an enum. You should always use enums when a variable (especially a method parameter)
 * can only take one out of a small set of possible values. Examples would be things like type constants 
 * (contract status: “permanent”, “temp”, “apprentice”), or flags (“execute now”, “defer execution”)
 * example is used in chess game programming;
 * 
 * enum ChessPiece {
 * PAWN, ROOK, KNIGHT, BISHOP,QUEEN, KING;
 * }
 * If you use enums instead of integers (or String codes), you increase compile-time checking and avoid errors from passing
 * in invalid constants, and you document which values are legal to use.
 */
 
public class enumExample 
{
	// enum declaration
	public enum Company 
	{
		EBAY, PAYPAL, GOOGLE, YAHOO, ATT
	}
 
	Company cName;
 
	// constructor declaration
	public enumExample(Company cName) 
	{
		this.cName = cName;
	}
	
	// method for company details
	public void companyDetails() 
	{
		switch (cName) 
		{
		case EBAY:
			System.out.println("Biggest Market Place in the World.");
			break;
 
		case PAYPAL:
			System.out.println("Simplest way to manage Money.");
			break;
 
		// because we left out google in the switch statements, the default case action will be assign
		case YAHOO:
			System.out.println("1st Web 2.0 Company.");
			break;

		case ATT:
			System.out.println("Number 1 Telecom provider in North & South America");
			break;
			
		default:
			System.out.println("Google - biggest search giant");
			break;
		}
	}
 
	public static void main(String[] args) 
	{
		enumExample ebay = new enumExample(Company.EBAY);
		ebay.companyDetails();
		
		enumExample paypal = new enumExample(Company.PAYPAL);
		paypal.companyDetails();
		
		enumExample google = new enumExample(Company.GOOGLE);
		google.companyDetails();
		
		enumExample yahoo = new enumExample(Company.YAHOO);
		yahoo.companyDetails();
		
		enumExample att = new enumExample(Company.ATT);
		att.companyDetails();
	}
}