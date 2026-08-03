// 4  3  2  1 
// 5  6  7  8 
// 12 11 10 9
// 13 14 15 16


class Pattern9 
{
	public static void main(String[] args) 
	{-+++
	    int n = 4;
		
		int num =4;
		
		for (int i= 1 ; i <= n ; i++ )
		{
			for (int j=1 ;j<=n ; j++)
			{
				if (i%2!=0)
				{
					System.out.print(num-- + " ");
					if(num<9) System.out.print(" "); 
				}
				else
				{
					System.out.print( num++ + " ");
					if(num<9) System.out.print(" ");
				}
			}
			
			if (i%2!=0)
			{
				num = num +(n+1);
			}
			else
			{
				num= num +( n-1);
			}
			
			System.out.println();
			
		}
	}
}
