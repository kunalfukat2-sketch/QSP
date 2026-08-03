
//  A B C D
//  E F G H
//  I J K L
//  M N O P


class Pattern4 
{
	public static void main(String[] args) 
	{
		int n = 4;
		
		char ch = 'A';
		
		for (int i = 1; i<=n ;i++ )
		{
			for (int j=1 ; j<=n ;j++ )
			{
				System.out.print(ch++ +" ");
			}
			
			System.out.println();

		}
	}
}
