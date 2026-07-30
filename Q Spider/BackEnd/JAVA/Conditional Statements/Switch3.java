import  java.util.Scanner;

// Gym Daily Routine

class Switch3 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Day :");
		
		String day = sc.next();
		
		switch (day)
		{
		case "Monday" :
			{
				System.out.println("Chest and Tricep");
				break;
			}
		
		case "Tuesday" :
			{
				System.out.println("Back and Biceps");
				break;
			}
		case "Wednesday" :
			{
				System.out.println("Sholder and legs");
				break;
			}
		case "Thrusday" :
			{
				System.out.println("Chest and Tricep");
				break;
			}
		case "Friday" :
			{
				System.out.println("Back and biceps");
				break;
			}
		case "Saturday" :
			{
				System.out.println("sholder and abs");
				break;
			}
			
		case "Sunday" :
			{
				System.out.println("Rest Day");
			}
		
		}
	}
}
