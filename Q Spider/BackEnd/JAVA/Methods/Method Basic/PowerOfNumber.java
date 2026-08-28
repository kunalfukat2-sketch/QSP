import java.util.Scanner;
class PowerOfNumber 
{
	static int base,raise;
	
	public static void main(String[] args) 
	{
		System.out.print("Enter a base:");
		base = new Scanner(System.in).nextInt();
		System.out.print("Enter a raise:");
		raise= new Scanner(System.in).nextInt();

		FindPower();
	}
	
	public static void FindPower()
	{ 
		int pro = 1;
		
		for (int i = 1; i<=raise ; i++ )
		{
			pro = pro*base;
		}
		
		System.out.println(base+"^"+raise+"  is  "+pro);
	}
	
}
