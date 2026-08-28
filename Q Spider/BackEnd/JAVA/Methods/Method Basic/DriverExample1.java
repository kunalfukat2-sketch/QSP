import java.util.Scanner;
class DriverExample1
{
	static int num ;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		num = sc.nextInt();
		
		numCall();
		
	}
	
	public static	 void numCall()
	{
		
		reverseNumber();
		sumOfDigits();
		proOfDigits();
	}
	
	public static void reverseNumber()
	{
		int rev = 0;
		int temp = num;
		
		while (temp!=0)
		{
			rev = rev*10+(temp%10);
			
			temp = temp/10;
		}
		
		System.out.println("Reverse number: "+ rev);
	}
	
	public static void sumOfDigits()
	{
		int sum = 0;
		int temp = num;
		
		while (temp!=0)
		{
			sum = sum + (temp%10);
			temp/=10;
		}
		
		System.out.println("sumOfSum:"+ sum);
		
	}
	
	
	public static void proOfDigits()
	{
		int pro = 1;
		int temp = num;
		
		while (temp!=0)
		{
			pro = pro*(temp%10);
			temp = temp/10;
		}
		
		System.out.println("proOfPro:"+ pro);
		
	}
}
