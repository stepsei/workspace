
	
	import java.util.Scanner;
import java.io.InputStream;

	public class Largest_String1 
	{
	    public static void main(String[] args)
	    {
	    	
	         Scanner input=new Scanner(System.in);
	         
	         System.out.println("Input Strings here: ");
	         
	         String array[] = new String[5];

	         for(int i=0; i<5; i++)
	         {
	            System.out.print("Enter String number " + (i+1)+ ":" + "\n");
	            
	             array[i]= input.nextLine();
	         }
	             
	         for(String s : array)
	           {
	            	 System.out.print(s+",");
	           }
	    }
}
	
