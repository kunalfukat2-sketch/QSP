    //                                         *             *
    //                                         * *         * *
    //                                         * * *     * * *
    //                                         * * * * * * * *
    //                                         * * * * * * * *
    //                                         * * *     * * *
    //                                         * *         * *
                                               *             *

class Pattern18 
{
	public static void main(String[] args) 
	{
		
		int n = 4;
		
		// Part1
		for (int i=1;i<=n ; i++)
		{
		 	
			
			// Star 
			for (int j=1;j<=i ;j++ )
			{
				System.out.print("*"+" ");
			}
			
			// Spaces 
			int spaces = 2*(n-i);
			for (int j = 1 ; j<=spaces; j++ )
			{
				System.out.print(" "+" ");
			}
			
			// Star
			for (int j=1;j<=i ;j++ )
			{
				System.out.print("*"+" ");
			}
			
			System.out.println();
		}
		
		
		// Part2
		
		for (int i=n;i>=1 ; i--)
		{
			
			
			//Star1
			for (int j=1;j<=i ;j++ )
			{
				System.out.print("*"+" ");
			}
			
			// Spaces 
			int spaces = 2*(n-i);
			for (int j = 1 ; j<=spaces; j++ )
			{
				System.out.print(" "+" ");
			}
			
			
			//Star2
			for (int j=1;j<=i ;j++ )
			{
				System.out.print("*"+" ");
			}
			
			
			System.out.println();0
		}
		
		
		
		
	}
}
