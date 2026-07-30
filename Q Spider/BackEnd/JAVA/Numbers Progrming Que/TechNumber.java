import java.util.Scanner;
class TechNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a  Number :");
		int num = sc.nextInt(); // 2025
		
		int sum = 0;
		for (int i = num ; i != 0 ; i/=100 )
		{
			int last = i % 100;
		
			sum = sum + last;
		}
		
		 int square  = sum * sum;
		
		if ( square == num )
		{
			System.out.println("TechNumber");
		}
		else
		{
			System.out.println("Not TechNumber");
		}
	}
}
