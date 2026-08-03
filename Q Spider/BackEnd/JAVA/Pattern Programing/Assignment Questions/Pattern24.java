8 a 4 e
7 b 3 f
6 c 2 g
5 d 1 h


class Pattern24 
{
	public static void main(String[] args) 
	{
		int n = 4;
		
		
		
		for (int i = 1; i<=n ;i++ )
		{
			int num = ( (n*n/2)-i+ 1 ) ;   //****************
			
			char ch = (char) ( 'a' + i - 1); //************
			
			for (int j = 1; j<=n ;j++ )
			{
				if (j%2!=0)
				{
					System.out.print(num + " ");
					
					num = num - n;
				}
				else
				{
					System.out.print(ch + " ");
					
					ch += n;
				}
				
			}
			
			System.out.println();
		}
	}
}
