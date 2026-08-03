
// 1  2  3  4
// 5  6  7  8
// 9  10 11 12
// 13 14 15 16

class Pattern2 
{
	public static void main(String[] args) 
	{
		int n = 4;
	
	    int num =1 ;
		
		for (int i = 1 ; i<=n ;i++ )
		{
			for (int j=1; j<=n ;j++ )
			{
				System.out.print(num++ + " ");
				if(num<=10) System.out.print(" ");
			}
				System.out.println();
		}
	}
}
