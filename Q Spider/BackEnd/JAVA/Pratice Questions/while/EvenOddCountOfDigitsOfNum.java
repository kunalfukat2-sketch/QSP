// Give the count of Even digits and odd digits in the number

import java.util.Scanner;

class  EvenOddCountOfDigitsOfNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		
		int num = sc.nextInt();
		
		int evenCount=0;         
		int oddCount=0;          
		
		while (num!=0)
		{
			int last = num%10;
			
			if (last%2 == 0)
			{
				evenCount++;
			}
			else 
			{
				oddCount++;
			}
			
			num/=10;
			
		}
		    System.out.println("Even Digit Count = " + evenCount);
            System.out.println("Odd Digit Count = " + oddCount);
		
	}
}
