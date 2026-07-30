import java.util.Scanner;
class Prime1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num = sc.nextInt();
		
		int count = 2;
		
		for (int i= 2; i < num ; i++ )
		{
			if (num % i ==0 )
			{
				count++;
				
				break;
			}
		}
		
		if ( count == 2)
		{
			System.out.println("The number is a prime number");
		}
		else
		{
			System.out.println("The number is not a prime number");
		}
	}
}
