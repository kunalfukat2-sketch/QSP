import java.util.Scanner;
class  StrongMethod1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a NUmber :");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		
		while (num!=0)
		{
			int last = num % 10;
			
			int fact = factOfPrime(last);
			
			sum = sum + fact;
			
			num = num / 10;
			
		}
		if (sum == temp)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}
	}
	
	public static int factOfPrime(int num)
	{
		
		int fact = 1;
		for ( int i = 1; i <= num ; i++)
		{
			fact = fact * i;
		}
		
	    return fact;
	}	
	
}
