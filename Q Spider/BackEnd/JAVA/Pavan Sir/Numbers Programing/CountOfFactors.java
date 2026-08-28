import java.util.Scanner;
class  CountOfFactors
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = sc.nextInt();
		
		int ct = 0;
		
		for (int i = 1 ; i<=num ;i++ )
		{
			if (num%i==0)
			{
				ct++;
			}
		}
		System.out.println(ct);
		
		if (ct%2==0)
		{
			System.out.println("Even Count");
		}
		else
			System.out.println("Odd Count");
	}
}
