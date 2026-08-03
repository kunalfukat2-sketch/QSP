  ///  1 A 5 E
  ///  2 B 6 F
  ///  3 C 7 G
  ///  4 D 8 H
    
	
	 //************    char ch = (char) ('A'+i-1); 
	 
	 
class Pattern18 
{
	public static void main(String[] args) 
	{
		int n = 4;
		

		for (int i = 1; i<=n ;i++ )
		{
			int num = i;
		
		    char ch = (char) ('A'+i-1);  
			
			for (int j = 1; j<=n ;j++ )
			{
				if (j%2!=0)
				{
					System.out.print(num + " ");
					
					num = num +n;
				}
				else
				{
					System.out.print( ch + " ");
					
					ch += n;
				}
			}
			
					System.out.println();

		}
	}
}
