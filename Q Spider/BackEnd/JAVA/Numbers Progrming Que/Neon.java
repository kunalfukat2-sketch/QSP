// Neon number the Sum of the square num is equal to actual number ex 9 square is 81 and sum of 81 is 9 .
// And Neon Numbers Are 0,1,9...
import java.util.Scanner;
class Neon 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Entar A Number:");
		int num = sc.nextInt();
		
		int square = num*num;
		int sum =0;
		
		while (square!=0)
		{
			int last = square%10;
			sum = sum + last;
			square/=10;
		}
		if (sum==num)
		{
			System.out.println("The Num is Neon");
			
		}
		else
		{
			System.out.println("The Num is Not Neon");
		}
	}
}
