 // Question --> Using a DO  WHILE loop statement Taking a input from the user to print a table 

import java.util.Scanner;
class  Pratice7
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entar a Number : ");
		
		int num = sc.nextInt();
		
		int i = 1;
		
		do
		{
			System.out.println(num+"*"+i+"="+(num*i));
			i++;
		}
		while (i<=10);
	}
}
