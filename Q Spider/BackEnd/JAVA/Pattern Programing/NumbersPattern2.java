class NumbersPattern2

{
	public static void main(String[] args) 
	{
		int n = 5;
		int num=1;
		int a=num;
		int b=num+1;
		int c=n-1;
		int d=n-1;
		for (int i=1; i<=n ;i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				if (i==1)
				{
					System.out.print(a++ + " ");
				}
				else if (j==1)
				{
					System.out.print(b++ + " " );
					
				}
				else if (i==n)
				{

					System.out.print(c--  + " ");
				}
				else if (j==n)
				{
					
					System.out.print(d-- + " ");
				}
				
				System.out.print(" ");
			
			
		    
			}
		
	        	System.out.println();
	
	
	   }


    }

}