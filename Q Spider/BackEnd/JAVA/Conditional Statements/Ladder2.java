import java.util.Scanner;

class  Ladder2
{ 
	
	// Month Wise Seasons 
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Month Number :");
		int month = sc.nextInt();
		
		
		if(month<=0 || month>12)
		{
			System.out.println("First go to School");
		}
		else if(month==2 || month==3 )
		{
			System.out.println("Spring");
		}
		else if(month==4 || month==5 || month==6)
		{
			System.out.println("Summer");
		}
		else if( month==7 || month==8 || month==9)
		{
			System.out.println("Monsoon");
		}
		else if(month==10 || month==11)
		{
			System.out.println("Autumn");
		}
		else
		{
			System.out.println("Winter");
		}
	}
}
