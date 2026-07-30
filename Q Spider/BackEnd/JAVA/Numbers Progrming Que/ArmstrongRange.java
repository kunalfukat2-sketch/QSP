import java.util.Scanner;
class ArmstrongRange
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a starting Number :");
		int start = sc.nextInt();
		
		System.out.print(" Enter a ending Number :");
		int end = sc.nextInt();
		
		
			for ( int i = start ; i <= end ; i++ )
			{
				
				
				int count = 0;
				
				for ( int j=i; j != 0 ; j /= 10 )
				{
					count++;
				}
				
				
				
				int sum = 0;
					
				for (int k = i ; k != 0 ; k/=10 )
				{
					int base = k % 10;
					
					
					int pow =  1;
					
					for ( int j = 1; j<=count ; j++ )
					{
						pow = pow*base;
					}
					
					sum = sum + pow;
				}
					
				if (sum == i)
				{
					System.out.println(i);
				}
			
			}
		
		
	}
}
