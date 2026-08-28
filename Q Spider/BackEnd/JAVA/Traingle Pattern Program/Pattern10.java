// 4 4 4 4
// 3 3 3
// 2 2
// 1

class Pattern10 
{
	public static void main(String[] args) 
	{
		int n = 4;
		
		int num = n;
		
		for (int i = 1;  i<=n ; i++)
		{
			for (int j= 1 ;j<=n ; j++)
			{
				if ((i+j)<=n+1)
				{
					System.out.print(num + " ");
				}
			}
			
			num--;
			
			
			System.out.println();
		}
	}
}
