class NeonMethod 
{
	public static void main(String[] args) 
	{
		for ( int i = 0 ; i<=200 ; i++ )
		{
			if (isNeon(i))
			{
				System.out.println(i);
			}
		}
	}
	
	public static boolean isNeon( int num)
	{
		if (num<0)
		{
			return false;
		}
		else
		{
			int square = num*num ;
			int sum = 0;
			
			while ( square != 0)
			{
				int last = square % 10;
				
				sum = sum + last;
				
				square /= 10;
			}
			if ( sum == num)
			{
				return true;
			}
			
			    return false;
		}
	}
}
