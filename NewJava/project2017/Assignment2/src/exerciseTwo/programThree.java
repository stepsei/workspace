package exerciseTwo;


/*********************************************************************************************
 * File(s): programTwo.java	(Question 4)											     				 *
 * Execution:  programThree is the main class containing the main method 					 *
 * 									 														 *
 * *******************************************************************************************
 * A modified msp3 to print out the maximum subsequence product, input elements, first and last 
 * position of the maximum subsequence product using a divide and conquer algorithm and keeping 
 * track of number of positions that where either negative or positive.
 * Time Complexities for this program O(nlogn).
 * */


import java.util.Scanner; 
import java.lang.Math;  

public class programThree {
	static int a[]; 																		//Array a
	static int maxProduct;																	//Maximum Subsequence product
	static int prodlt, prodrt;																//product at any instance for lEFT and RIGHT
	static int p1; 		    																//p1 reflect the starting boundary of the current subsequence to be evaluated
	static int p2;  																		//p2 reflect the ending boundary of the current subsequence to be evaluated
	static int n;																			//size of array
	static int m;																			//midpoint of the starting and ending boundaries
	static int L, R;																		//msp3 for left and right half of the array list
	static int PL, PR;																		//Related to msp3 for both left and right based on prodrt and prodlt
	public programThree(){  																//default constructor 
	}


	public static int msp3(int a[], int p1, int p2)  
	{  
		int maxProduct =1;  
		if (p1 == p2)  
		{  
			// maxProduct = a[p1];  
			maxProduct = a[p1]; 
			if(maxProduct < 1)
			maxProduct = 0;
			
		}  
		else  
		{  
			int m = (p1 + p2)/2;  
			int L = msp3(a,p1,m);
			int R = msp3(a,m+1,p2);  
			int prodlt = 1; 
			int prodrt = 1; 
			int PL = 0; 
			int PR = 0;  
			int numNegL = 0; 																// number Of Negatives in the L side of any subsequence
			int numNegR = 0;  																// number Of Negatives in the R side of any subsequence
			int lastIndOnOddNegR =0;  														// The last recorded Position Before Odd Negative in R
			int lastIndOnOddNegL =0;  														// The last recorded Position Before Odd Negative in L
			int lastProdOnOddNegR = 1;  													// The last recorded Product Before Odd Negative in R
			int lastProdOnOddNegL = 1;  													// The last recorded Product Before Odd Negative in L
			int lastProdOnEvenNegL = 1;  													// The last recorded Product Before Even Negative in L
			int lastProdOnEvenNegR = 1;  													// The last recorded Product Before Even Negative in R
			int lastIndOnEvenNegL = 0;  													// The last recorded Position Before Even Negative in L
			int lastIndOnEvenNegR = 0; 														// The last recorded Position Before Even Negative in R 
			
			
			for (int i =m; i>=p1; i--) 				   										//for loop of the left side
			{  
				if (a[i]!=0)  
				{
					prodlt = prodlt * a[i];  
					PL = prodlt;
				}  
				else  
				{  
					break;  
				}  
				if (a[i]<0)  																//keeps track of number of negative numbers
				{  
					numNegL++;  
					if ((numNegL%2)!=0)  
					{  
						lastIndOnOddNegL = i;  
						lastProdOnOddNegL = PL;  
					}  
					if ((numNegL%2)==0)  
					{  
						lastIndOnEvenNegL = i;  
						lastProdOnEvenNegL = PL;  
					}  
				}  
			}  
			for (int i = m+1; i<=p2; i++)  													//for loop of the right side
			{  
				if (a[i]!=0)  
				{
					prodrt = prodrt * a[i];  
					PR = prodrt;
				}  
				else  
				{  
					break;  
				}  
				if (a[i]<0)  																//keeps track of number of negative numbers
				{  
					numNegR++;  
					if ((numNegR%2)!=0)  
					{  
						lastIndOnOddNegR = i;  
						lastProdOnOddNegR = PR;  
					}  
					if ((numNegR%2)==0)  
					{  
						lastIndOnEvenNegR = i;  
						lastProdOnEvenNegR = PR;  
					}  
				}  
			}  
			if ((numNegL+numNegR)%2==0)  													// total negatives in both sides
			{
				maxProduct = Math.max(Math.max(L,R),PL*PR);
			}  
			else  
			{  
				if ((numNegR)%2!=0) 														//all product on left and product up till negative number on right
				{  
					// all possible cases;
					
					int maxStrProd1 =1;  							      			 		// maximum straddle a product can produce for any of the subsequence(s) 
					int maxStrProd2 =1;  								   					// that extend across both side (L & R)
					int maxStrProd3 =1;  													//cancels out last negative causing negative straddle
					if (a[lastIndOnEvenNegL]!=0)  											//To be able to go at a far left as possible
					{ 
						maxStrProd1 = PR*lastProdOnEvenNegL/a[lastIndOnEvenNegL];
					}  
					if (a[lastIndOnOddNegR]!=0)  
					{ 
						maxStrProd2 = PL*lastProdOnOddNegR/a[lastIndOnOddNegR];
					}  
					if (a[lastIndOnEvenNegR]!=0)  
					{  
						maxStrProd3 = PL*lastProdOnEvenNegR/a[lastIndOnEvenNegR];  
					}  
					
					int mxStr1 = Math.max(maxStrProd1, maxStrProd2);  
					int mxStr2 = Math.max(mxStr1,maxStrProd3);  
					maxProduct = Math.max(Math.max(L,R),mxStr2);  
				}
				
				if ((numNegL)%2!=0)  														//all produce on right and product up till negative number on left
				{  
					// all possible cases;
					int maxStrProd1=1;  
					int maxStrProd2=1;  
					int maxStrProd3=1;  
					if (a[lastIndOnEvenNegR]!=0)  											//cancels out last negative causing negative straddle
					{ 
						maxStrProd1 = PL*lastProdOnEvenNegR/a[lastIndOnEvenNegR];			//To be able to go at a far right as possible
					}  
					if (a[lastIndOnOddNegL]!=0)  
					{ 
						maxStrProd2 = PR*lastProdOnOddNegL/a[lastIndOnOddNegL];
					}  
					if (a[lastIndOnEvenNegR]!=0)  
					{  
						maxStrProd3 = PL*lastProdOnEvenNegR/a[lastIndOnEvenNegR];
					}
					
					int mxStr1 = Math.max(maxStrProd1, maxStrProd2); 
					int mxStr2 = Math.max(mxStr1,maxStrProd3);  

					maxProduct = Math.max(Math.max(L,R),mxStr2);  
				}  
			} 
		}  
		return maxProduct;  
	}  

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n;

		System.out.println("Enter the Array size N:");

		n = input.nextInt();
		int[] a = new int[n];

		for (int i=0; i<n; i++)
		{
			a[i] =input.nextInt(); 

		}

		input.close();

		System.out.println("Input Elements: ");
		System.out.println("*******************************");

		for(int i =0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");

		int p1 = 0;  
		int p2 = a.length-1; 

		maxProduct = msp3(a,p1,p2);
	

		System.out.println("*******************************");
		System.out.println("First position: " + p1);
		System.out.println("*******************************");
		System.out.println("Last  position: " + p2);
		System.out.println("*******************************");
		System.out.println( "Max Product is " + maxProduct);
		
	}

}