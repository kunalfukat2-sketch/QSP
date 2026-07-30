// Find The Product of Prime Number Between 1 - 100


class ProductPrimeMethod 
{
	public static void main(String[] args) 
	{ 
		
		int product = 1;
		
		for (int i = 1 ; i <= 100 ; i++ )
		{
			if (isPrime(i))
			{
				product = product*i;
			}
		}
		
		System.out.println(product);
	}
	public static boolean isPrime( int num)
	{
		
		if (num <= 1)
		{
			return false;
		}
		else
		{
			for (int i =2 ; i < num ; i++ )
			{
				if ( num % i == 0)
				{
					return false;
				}
			}
			
			return true;
		}
		
	}
}
