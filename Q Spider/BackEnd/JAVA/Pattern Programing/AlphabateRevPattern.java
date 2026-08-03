class AlphabateRevPattern 
{
	public static void main(String[] args) 
	{
		
		
		int n = 4 ;
			
		char ch = (char) ('a'+ (n*n)-1);
			
		for (int i = 1 ; i<=n ; i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				System.out.print( ch-- + " " );
			}
			
			System.out.println();
		}
	}
}


   // p o n m
   // l k j i
   // h g f e
   // d c b a
