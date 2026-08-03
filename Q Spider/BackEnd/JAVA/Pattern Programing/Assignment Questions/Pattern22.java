//	8 7 6 5
//	a b c d
//	4 3 2 1
//	e f g h

class Pattern22 
{
	public static void main(String[] args) 
	{
		int n = 4;
		
		int num = n*n/2;
		
		char ch = 'a';
		
		for (int i = 1; i<=n ;i++ )
		{
			for (int j=1; j<=n; j++ )
			{
				if (i%2!=0)
				{
					System.out.print(num-- + " ");
				}
				else
				{
					System.out.print(ch++ + " ");
				}
			}
			
			System.out.println();
		}
	}
}
