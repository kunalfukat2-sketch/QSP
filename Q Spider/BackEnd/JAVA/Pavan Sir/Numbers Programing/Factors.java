import java.util.Scanner;
class Factors
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = sc.nextInt();
		
		for (int i = 1 ; i<=num ;i++ ) // i<=num/2  opimise 
		{
			if (num%i==0)
			{
				System.out.println(i);
			}
		}
		//System.out.println(num);
		
		
		
	}
}
