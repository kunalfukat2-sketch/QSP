//A Harshad Number is a number that is completely divisible by the sum of its digits.
//Example: 18
//Sum of digits:
//1 + 8 = 9
// 18 % 9 = 0 ✅

import java.util.Scanner;
class HarshadNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int temp = num;
		
		while (num!=0)
		{
			int last = num%10;
			
			sum = sum  + last;
			
			num = num/10;
		}
		if (temp % sum == 0)
		{
			System.out.println("Harshad Number");
		}
		else
		{
			System.out.println(" Not Harshad Number");
		}
	}
}
