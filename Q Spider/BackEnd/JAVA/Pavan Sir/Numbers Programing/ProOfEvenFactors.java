import java.util.Scanner;
class ProOfEvenFactors 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = sc.nextInt();
		
		int pro = 1;
		
		for (int i =1; i<=num ;i++ )
		{
			if (num%i==0 && i%2==0)
			{
				pro=pro*i;
			}
		}
		
		System.out.println("product of All even factors is: "+pro);
	}
}
