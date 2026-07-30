//Find The Minimum (Smallest) Digit of Given Number
import java.util.Scanner;
class MinOfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = sc.nextInt();
		
		int min = 9;
		
		while (num!=0)
		{
			int last = num%10;
			
			if ( last < min)
			{
				min = last;
			}
				num = num/10;
	
		}
			System.out.println(min);
	}
}
