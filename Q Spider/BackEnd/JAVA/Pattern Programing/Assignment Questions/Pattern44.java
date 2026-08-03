 //             1 2 3 4 5
 //             1       5
 //             1       5
 //             1       5
 //             1 5 5 5 5


class Pattern44 
{
	public static void main(String[] args) 
	{
		int n = 5;
		
		for ( int i = 1; i<=n ; i++)
		{
			for (int j = 1 ; j<=n  ; j++)
			{
				
				if ( i==1 || j==1 || j==n)
				{
					System.out.print(j +" ");
				}
				else if(i==n)
				{
					System.out.print(i + " ");
				}
				else
				{
					System.out.print(" "+" ");
				}
				
			}
			
			System.out.println();
		}
		
		
		
	}
}
