// 1 2 3 4 5 6
// 1 2       6
// 1   3     6
// 1     4   6
// 1       5 6
// 1 2 3 4 5 6

class Pattern40 
{
	public static void main(String[] args) 
	{
		int n = 6;
		
		int num = 1;
		 
		for (int i=1 ; i<=n ; i++ )
		{
			for (int j=1 ; j<=n ;j++ )
			{
				if (j==n || i==1 || i==n || j==1 || i==j)
				{
					System.out.print(j +" ");
				}
				else
				{
					System.out.print(" " +" ");
				}
			}
			
			System.out.println();
		}
	}
}
