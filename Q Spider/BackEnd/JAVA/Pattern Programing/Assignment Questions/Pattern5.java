// P O N M
// L K J I
// H G F E
// D C B A


class Pattern5 
{
	public static void main(String[] args) 
	{
		int n  = 4;
		
		char ch = (char) ( 'A' + (n*n)-1);
		
		for (int i =1 ; i<=n ;i++ )
		{
			for (int j=1; j<=n ; j++ )
			{
				System.out.print(ch-- + " ");
			}
			
		    System.out.println();

		}
	}
}
