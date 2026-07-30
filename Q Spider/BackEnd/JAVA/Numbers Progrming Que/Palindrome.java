//Check the numbers is Palindrome

import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		
		int num = sc.nextInt();
		
		int rev = 0;
		
		int temp = num;              // --------- ###  same As a Reverse number that one Change onlyy
		
		while (temp!=0)
		{
			int last = temp%10;
			
			rev = rev*10+last;   /// imp
			
			temp = temp/10;	
		}
		if (rev == num)
		{
			System.out.println("The Num is Palindrome");
		}
		else
		{
		    System.out.println("The num is not palindrome");
		}
	}
}
