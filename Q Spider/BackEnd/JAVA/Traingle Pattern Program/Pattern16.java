//  *
//  * *
//  * * *
//  * * * *
//  * * *
//  * *
//  *

import java.util.Scanner;
class Pattern16
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num Of Rows : ");
		int n = sc.nextInt();
		
		
		//part1
		for (int i = 1; i<=n ;i++ )
		{
			for (int j = 1; j<=n ; j++ )
			{
				if (i>=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			
			}
			System.out.println();
		}
		  
		  
		  
		 // part2
		for (int i =2; i<=n ; i++ )
		{
			for (int j=1 ; j<=n ;j++ )
			{
				if (i+j<=n+1)
				{
					System.out.print("*"+" ");
				}
					
			}
			
			System.out.println();
		}
		
	}
}  
