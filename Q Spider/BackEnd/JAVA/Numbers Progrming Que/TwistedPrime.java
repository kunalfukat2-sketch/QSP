import java.util.Scanner;
class TwistedPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num = sc.nextInt();
		//int temp = num;
		//int rev = 0;
		boolean isPrime= true;
		
		for (int i = 2; i < num ; i++ )
		{
			if ( num%i==0)
			{
			  isPrime = false;	
			  break;
			}
			
			int rev = 0;
			int temp = num;
			
			while (temp != 0)
			{
				int last = temp %10;
				
				rev = rev*10+last;
				
				temp/=10;
			}
			
			for (int j =2; j <rev ;j++ )
			{
				if (rev%j==0)
				{
					isPrime= false;
					break;
				}
			}
		}
		if (isPrime)
		{
			System.out.println("The NUmber is a Twisted Number:");
		}
		else
		{
			System.out.println("The NUmber is NOT a Twisted Number:");
		}
		
		
		
		//while (temp != 0)
		//{
		//	rev = rev * 10 + (temp % 10);
		//	
		//	temp /= 10;
		//}
		//
		//int count1 = 0;
		//	
		//for (int i = 2; i < num  ;i++ )
		//{
		//	if ( num % i == 0)
		//	{
		//		count1 ++;
		//		break;
		//	}
		//}
		//
		//int count2 = 0;
		//
		//for (int i =2 ; i < rev  ; i++ )
		//{
		//	if ( rev % i == 0)
		//	{
		//		count2 ++;
		//		break;
		//	}
		//}
		//
		//if ( count1 == 0 && count2 == 0)
		//{
		//	System.out.println(" The number is a Twinted Number");
		//}
		//else
		//{
		//	System.out.println("The number is not a Twinted Number");
		//}
		
	}
}
