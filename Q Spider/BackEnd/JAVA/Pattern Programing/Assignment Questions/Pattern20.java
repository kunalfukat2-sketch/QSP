//  8 H 7 G
//  6 F 5 E
//  4 D 3 C
//  2 B 1 A

class Pattern20 
{
	public static void main(String[] args) 
	{
		int n = 4;
		
		int num = (n*n)/2;
		
		char ch = (char) ('A' + (n*n/2)-1);
		
		for (int i = 1; i<=n ;i++ )
		{
			
			for (int j=1;j<=n ;j++ )
			{
				if (j%2!=0)
				{
					System.out.print(num-- +" ");
					
				}
				else
				{
					System.out.print(ch-- + " " );
				}
			}
			
			System.out.println();
		}
	}
}
