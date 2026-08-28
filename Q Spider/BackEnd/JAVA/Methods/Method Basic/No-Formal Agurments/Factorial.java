import java.util.Scanner;
class Factorial 
{
	
	static int num;
	
	public static void main(String[] args) 
	{
		System.out.print("Enter a number:");
		num = new Scanner(System.in).nextInt();
		
		findFactorial();
	}
	
	public static void findFactorial()
	{
		int pro = 1;
		for (int i = 1 ; i<=num ;i++ )
		{
			pro = pro*i;
		}
		
		System.out.println(pro+" is Factorial of  "+num);
	}
}
