
//                 E D C B A
//                 J I H G F
//                 O N M L K
//                 T S R Q P

class Pattern43
{
	public static void main(String[] args) 
	{
		int  n = 5;
		
		
		
		for (int i = 1; i<=4 ;i++ )
		{
			char ch = (char)  ('A'+(i*n)-1);
					
			for (int j=1;j<=n ;j++ )
			{
				System.out.print(ch-- + " ");
			
			}
				
			System.out.println();
		}
	}
}
