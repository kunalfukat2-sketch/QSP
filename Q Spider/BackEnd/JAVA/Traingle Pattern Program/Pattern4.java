// A
// B B
// C C C
// D D D D

import java.util.Scanner;
class Pattern4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num Of Rows : ");
		int n = sc.nextInt();
		
		char ch = 'A';
		
		for (int i = 1; i<=n ;i++ )
		{	
			
			
			for (int j = 1; j<=n ; j++ )
			{
				if (i>=j)
				{
					System.out.print(ch +" ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			
			ch+=1;
			
			System.out.println();
		}
		  
		
	}
}  
