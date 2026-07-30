// print Xylem numnber between 1 - 1000


class xylemNumber 
{
	public static void main(String[] args) 
	{
		for ( int i = 1 ; i <= 1000 ; i++ )
		{
			if (isXylem(i))
			{
				System.out.println(i);
			}
		}
	}
	
	public static boolean isXylem( int num)
	{
		if (num < 100)
		{
			return false ;
		}
		else
		{
			int sumOfMid = 0;
			int sumOfEnd = num %10;
			         num/=10;
					 
			while ( num > 9 )
			{
				int last = num %10;
				 sumOfMid += last;
				 num /= 10;
			}
			
		    sumOfEnd += num;
			
			if ( sumOfEnd == sumOfMid)
			{
				return true;
			}
			    return false;
		}
	}
}
