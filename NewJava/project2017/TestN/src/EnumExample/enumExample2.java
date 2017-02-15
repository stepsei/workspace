package EnumExample;

/**NOTE: All enums implicitly extend java.lang.Enum. Since Java does not support multiple inheritance,
 *  an enum cannot extend anything else.
 * 
 * NOTE: Enum in Java are type-safe: Enum has it own name-space. It means your enum will have a type
 * for example “Company” in below example and you can not assign any value other than specified in Enum Constants.
 * 
 * public enum Company { EBAY, PAYPAL, GOOGLE, YAHOO, ATT
	}
	Company cName = Company.EBAY;
	cName = 1;   // Compilation Error
 *
 * NOTE:
 * You can specify values of enum constants at the creation time. MyEnum.values() returns an array of MyEnum’s values.
 */

public class enumExample2 {
	 
	public enum Company 
	{
		EBAY(30), PAYPAL(10), GOOGLE(15), YAHOO(20), ATT(25);
		
		private int value;
		
		//default constructor
		private Company(int value) 
		{
			this.value = value;
		}
	}
 
	public static void main(String[] args) 
	{
		//iterate through the array
		for (Company cName : Company.values()) 
		{
			System.out.println("Company Value: " + cName.value + " - Company Name: " + cName);
		}
		
/**
 * Enum can be safely compare using:
 * 1. Switch-Case Statement
 * 2. == Operator
 * 3. equals() method
 */
		Company eBay = Company.EBAY;
		if(eBay == Company.EBAY)
		{
			System.out.println("enum in java can be compared using ==");
		}
	}
}