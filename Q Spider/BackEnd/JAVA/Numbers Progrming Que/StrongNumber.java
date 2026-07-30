// Strong Number - A Strong Number is a number whose sum of the factorials of its digits is equal to the number itself.
 
   //              Example
   //              145
   //              1! = 1
   //              4! = 24
   //              5! = 120
   //              Sum = 1 + 24 + 120 = 145
   //              Therefore, 145 is a Strong Number.
   
   
import java.util.Scanner;
class  StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		
		while (temp != 0)
		{
			int last = temp % 10;
			
			int fact = 1;
			for (int i = 1; i <= last ; i++ )
			{
			   fact = fact * i;	
			}
			sum = sum + fact;
			
			temp = temp/10;
		}
		if ( sum == num )
		{
			System.out.println(" The "+num+" Is a Strong Number");
		}
		else
		{
			System.out.println("The "+num+" is Not a Duck Number");
		}
	}
}








//
//import java.util.Scanner;
//class  StrongNumber
//{
//	public static void main(String[] args) 
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a Number :");
//		
//		int num = sc.nextInt();
//		int sum = 0;
//		int temp = num;
//		
//		while (num!=0)
//		{
//			int last = num%10;
//			
//			int fact = 1;
//			for (int i = 1 ; i <= last ;i++ )
//			{
//				fact = fact * i;
//			}
//			sum = sum + fact;
//			
//			num/=10;
//		}
//		
//		if (sum == temp)
//		{
//			System.out.println("Strong");
//		}
//		else
//		{
//			System.out.println("Not Strong");
//		}
//		
//		
//		
//		
//	}
//	
//}