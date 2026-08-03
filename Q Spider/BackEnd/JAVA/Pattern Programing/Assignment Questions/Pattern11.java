// 1  8  9  16
// 2  7  10 15      * * *   *     *   * * * 
// 3  6  11 14        *     *  *  *   *   *
// 4  5  12 13        *     *     *   * * *
//                  * * *   *     *   *

class Pattern11 
{
	public static void main(String[] args) 
	{
		
		
		int n = 4;
		
		int a = 2*n-1;
		int b = 1;
		
		for (int i=1 ; i<=n ;i++ )
		{
			int num = i;
			
			for (int j= 1;j<=n ;j++ )
			{
				System.out.print(num + " ");
				if(num<=9) System.out.print(" ");
				
				if (j%2!=0)
				{
					num = num + a;
				}
				else
				{
					num = num + b;
				}
			}
			
			a = a-2;
			b = b+2;
			
			System.out.println();
		}
		
	}
}
