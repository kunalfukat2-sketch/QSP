// 2  4  6  8
// 10 12 14 16
// 18 20 22 24
// 26 28 30 32

class EvenOdd 
{
	public static void main(String[] args) 
	{
		int n = 4;
		
		int num = 2;
		
		for (int i = 1; i<=n  ; i++ )
		{
			for (int j = 1; j<=n ;j++ )
			{
				System.out.print(num + " ");
				if(num<10) System.out.print(" ");
				
				num = num + 2;
			}
			
			System.out.println();
		}
	}
}
