import java.util.Scanner;
class Disarium 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = sc.nextInt();
		
		
		if ( num>=0 && num<=9 )
		{
			System.out.println("Disarium Number");
		}
		else
		{
			int count=0;
			
			for (int i=num; i!=0 ; i/=10 )
			{
				count++;
			}
			
			
			int sum = 0;
			
			for (int i = num; i!=0 ; i/=10 )
			{
				int base = i %  10;
				
				int pow = 1;
				
				for (int j = 1; j<=count ; j++ )
				{
					pow = pow * base;  
				}
				
				sum = sum + pow;
				
				count --;
				
			}
			if ( sum == num )
			{
				System.out.println("Disarium Number");
			}
			else
			{
				System.out.println(" NOT Disarium Number");
			}
		}
		
		
	}
}
