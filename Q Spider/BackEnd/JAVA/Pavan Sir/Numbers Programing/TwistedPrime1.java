import java.util.Scanner;
class TwistedPrime1 
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
			
			boolean isTwisted = true;
			
			for (int i=2;i<num ;i++ )
			{
				if (num%i==0)
				{
					isTwisted = false;
				}
			}
			
			if (isTwisted)
			{
				    int rev = 0;
				    int temp=num;
				    
				    while (temp!=0)
				    {
				    	rev = rev*10+(temp%10);
				    	temp/=10;
				    }
				    
				    for (int i = 2;i<rev;i++ )
				    {
				    	if (rev%i==0)
				    	{
				    		isTwisted=false;
				    	}
				    }
					if (isTwisted)
					{
						System.out.println("It is a Twisted Prime");
					}
					else
			        {
			        	System.out.println("Not a Twisted Prime");
			        }
			}
			else
			{
				System.out.println("Not a Twisted Prime");
			}
			
		}
		
	}
}
