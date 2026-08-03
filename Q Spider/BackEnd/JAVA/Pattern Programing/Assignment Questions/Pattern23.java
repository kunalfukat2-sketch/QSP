// 1 h 5 d
// 2 g 6 c     * * *   *     *   * * *   
// 3 f 7 b       *     *  *  *   * * *
// 4 e 8 a       *     *     *   * 
//			   * * *   *     *   *    

class Pattern23 
{
	public static void main(String[] args) 
	{
		int n = 4;
		
		
		
		
		for (int i = 1; i<=n ;i++ )
		{
			int num = i;
			char ch = (char) ('a' + (n*n/2)-i ); // ******************
			
			for (int j = 1 ; j<=n ; j++ )
			{
				if (j%2!=0)
				{
					System.out.print(num + " ");
					
					num += n;
				}
				else
				{
					System.out.print(ch + " ");
					
					ch -= n;                          // ********************
				}
			}
			
            	System.out.println();

		}
		
	}
}
