import java.util.Scanner;
class Power 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Base Number:");
		int base = sc.nextInt();
		System.out.print("Enter a power Number:");
		int power = sc.nextInt();
		
		
		int ans = 1;
		
		for (int i = 1;i<=power ;i++ )
		{
			ans = ans*base;
		}
		
		System.out.println("The"+base+"^"+power +" = "+ans);
		
		
	}
}
