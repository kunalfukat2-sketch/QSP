// Print All the Digits of given Number

import java.util.Scanner;

class DigitsOfGivenNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Entar a Number :");
		
		int num = sc.nextInt();              //---------------------     // initilazation
		
		
		while (num != 0)                    // ---------------------    // conditon
			
		{
			int last = num%10;
			System.out.println(last);
			num/=10;                       //-----------------------    // updatation
			
		}
	}
}
