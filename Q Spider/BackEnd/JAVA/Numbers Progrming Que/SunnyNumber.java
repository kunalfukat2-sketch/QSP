// A Sunny Number is a number whose next number (number + 1) is a perfect square.

//Example: 8
//8 + 1 = 9
//9 = 3 × 3 → Perfect Square ✅

import java.util.Scanner;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num = sc.nextInt();
	
		int sum = num+1;
		boolean isSunny = false;
		
		for (int i = 1; i <= num ;i++ )
		{
			int sq = i*i;
			
			if ( sq == sum )
			{
				isSunny = true;
				break;
			}
			
		}
		if (isSunny)
		{
			System.out.println("The num is a Sunny Number");
		}
		else
		{
		    System.out.println("The num is a not a Sunny Number");
		}
	
	}
}
