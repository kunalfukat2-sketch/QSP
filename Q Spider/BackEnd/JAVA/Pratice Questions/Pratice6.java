 // Question --> Using a WHILE loop statement Taking a input from the user to print a table 


import java.util.Scanner;

class Pratice6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a number : ");
		
		int num = sc.nextInt();
		
		int i=1;
		
		while (i<=10)
		{
			System.out.println(num+"*"+i+"="+(num*i));
			i++;
		}
		
		
	}
}
