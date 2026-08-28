class PalindromicPattern
{
	public static void main(String[] args) 
	{
		int n = 5;
		
		int a = 1;
		
		for (int i=1; i<=n ; i++ )
		{
			int k=1;
			
			for (int j=1; j<=n-1 ;j++ )
			{
				System.out.print("  ");
			}
			
			for (int j=1; j<=a ;j++ )
			{
				if (k<=i && j<=(a/2)+1)
				{
					System.out.print(k++ + " ");
				}
				else
				{
					System.out.print(k-- -2 + " ");
					
				}
		    }
			
			a = a+2;	
			System.out.println();
		}
	}
}
