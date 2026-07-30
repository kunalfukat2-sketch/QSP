
// Largest of Two value

import java.util.Scanner;
 class  Largest
 {
 	public static void main(String[] args) 
 	{
 		Scanner sc = new Scanner(System.in);
 		
 		System.out.print("Enter a First Number : ");
 		int n1 = sc.nextInt();
		System.out.print("Enter a Second Number :");
		int n2 = sc.nextInt();
		
 		
 		if(n1>n2)
 		{
 			
 		  System.out.println("First Number is Largest");
 			  
 		}
 		else
 			{
 		   		System.out.println("Second Number is Largest");
 		}
 	}
}

   // #By using Conditional Operetors 

 
import java.util.Scanner;

class Largest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
 		
 		System.out.print("Enter a First Number : ");
 		int n1 = sc.nextInt();
		System.out.print("Enter a Second Number :");
		int n2 = sc.nextInt();
		
		String result = (n1>n2)?("First is Largest "):("Second is Largest");
		System.out.println(result);
		
		
	}
}