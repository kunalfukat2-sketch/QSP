// Find the Given number is  Dust Numbar or not 
// Dust number means the positive  number, Which have zero 0 digit on it
import java.util.Scanner;
class Dusk 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		while (num!=0)
		{
			int last = num % 10;
			

			if ( last==0)
			{
				System.out.println("This "+num+" is a Dusk Numbar");
				
				break;
			}
			num=num/10;
		}
		if (num == 0)
		{
			System.out.println("This no is not a Dusk numbar");
		}
		
	}
}
