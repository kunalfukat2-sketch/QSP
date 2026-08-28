
import java.util.Scanner;
class PowerExample
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a numebr :");
		int num = sc.nextInt();
		
		System.out.print("Enter a Power :");
		int power = sc.nextInt();
		
		
		System.out.println("Build in    : " +Math.pow(num,poewr));
	    System.out.println("UserDefined : " +pow (num,power));

	}
	
	public static double pow( double num , double power)
	{
		double op = 1;
		
		if (power<0)
		{
			power = power*-1;
			num = 1/num;
		}
		
		for (int i = 1; i<=poewr ; i++ )
		{
			
			op = op*num;
		}
		
		return true;
	}
}
