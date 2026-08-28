import java.util.Scanner;
class TwistedPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		
		if (num<=1)
		{
			System.out.println("Not a Twisted Prime");
		}
		else
		{
			int count = 2;
			
			for (int i=2; i<num ;i++ )
			{
				if (num%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				int rev = 0;
				int temp=num;
				while (temp!=0)
				{
					rev= rev*10+(temp%10);
					temp/=10;
				}
				
				for (int i = 2; i<rev ;i++ )
				{
					if (rev%10==0)
					{
						count++;
					}
				}
				if (couunt==0)
				{
					System.out.println("twisted Prime");
				}
				else
				{
					System.out.println("Not Twisted Prime");
				}
				
			}
			else
			{
				System.out.println("Not Twisted Prime");
			}
		}
		
	}
}
