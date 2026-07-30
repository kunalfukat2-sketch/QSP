import java.util.Scanner;
class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a Number :");
		int num = sc.nextInt();
		
		int temp1= num ;
		int count = 0;
		int sum = 0;
			
		while (temp1 != 0)
		{
			count++;
			temp1 /=10;
		}
		 
		int temp2 = num;
		 
		while ( temp2 != 0)
		{
			int base = temp2 % 10;
			
			int pow = 1;
			
			for ( int i = 1; i <= count ; i++ )
			{
				pow = pow * base;
				
			}
			
			sum = sum + pow;
			
			temp2 = temp2 / 10;
			
		}
		
		if ( sum == num )
		{
			System.out.println(" Armstrong Number");
		}
		else
		{
			System.out.println(" Not Armstrong Number");
		}
	}
}
