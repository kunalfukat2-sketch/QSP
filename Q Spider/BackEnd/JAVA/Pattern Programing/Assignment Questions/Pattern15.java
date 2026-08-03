//  4  8  12 16
//  20 24 28 32
//  36 40 44 48
//  52 56 60 64

// Print a Table

import java.util.Scanner;
class Pattern15
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a numbers of rows :");
		int n = sc.nextInt();
		
		System.out.print(" Enter a Number For Table:");
		int t = sc.nextInt();
		
		int a=t;
		
		for (int i = 1; i<=n ;i++ )
		{
			for (int j = 1 ; j<=n ; j++ )
			{
				System.out.print(a + " ");
				if (a<=9) System.out.print(" ");
				
				a = a + t;
				
			}
			
			System.out.println();
		}
	}
}
