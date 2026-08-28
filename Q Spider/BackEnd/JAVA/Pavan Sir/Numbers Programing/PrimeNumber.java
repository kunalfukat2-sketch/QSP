import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter a Number:");
	   int num = sc.nextInt();
	   
	   boolean isPrime = true;
	   
	   for (int i=2;i<=num/2 ;i++ )
	   {
		   if (num%i==0)
		   {
			   isPrime = false;
		   }
		   
	   }
	   if (isPrime)
	   {
		   System.out.println("It is a Prime");
	   }
	   
	   else
		   
		   System.out.println("It is not a Prime");
   
	}
}
