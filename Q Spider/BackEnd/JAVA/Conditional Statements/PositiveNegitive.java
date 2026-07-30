import java.util.Scanner;
 class  PositiveNegitive
 {
 	public static void main(String[] args) 
 	{
 		Scanner sc = new Scanner(System.in);
 		
 		System.out.print("Enter a Number : ");
 		int num = sc.nextInt();
 		
 		if(num>=0)
 		{
 			
 		  System.out.println("Number is Positive");
 			  
 		}
 		else
 			{
 		   		System.out.println("Number is Negitive");
 		}
 	}
}

// #By using Conditional Operetors 

 
import java.util.Scanner;

class PositiveNegitive
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		
		String result = (num>=0)?("Positive"):("Negitive");
		System.out.println(result);
		
		
	}
}