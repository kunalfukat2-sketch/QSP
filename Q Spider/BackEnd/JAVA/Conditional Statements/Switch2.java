// Histrocial placces  
import java.util.Scanner;
class  Switch2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Place Name :");
		String place = sc.next();
		
		switch (place)
		{
		case "nagpur" :
			{
				System.out.println("Top 5 Historical Places in Nagpur:");
                System.out.println("1. Sitabuldi Fort");
                System.out.println("2. Deekshabhoomi");
                System.out.println("3. Zero Mile Stone");
                System.out.println("4. Dragon Palace Temple");
                System.out.println("5. Ramtek Fort and Temple");
        break;
			}
			
		case "Pune" : 
			{
				System.out.println("Top 5 Historical Places in Pune:");
                System.out.println("1. Shaniwar Wada");
                System.out.println("2. Aga Khan Palace");
                System.out.println("3. Sinhagad Fort");
                System.out.println("4. Lal Mahal");
                System.out.println("5. Pataleshwar Cave Temple");
		break;
			}
			
		case "Mumbai" :
			{
		        System.out.println("Top 5 Historical Places in Mumbai:");
                System.out.println("1. Gateway of India");
                System.out.println("2. Chhatrapati Shivaji Maharaj Terminus (CST)");
                System.out.println("3. Elephanta Caves");
                System.out.println("4. Rajabai Clock Tower");
                System.out.println("5. Mani Bhavan");
		break;
			}
			
		case "Nashik" :
			{
		        System.out.println("Top 5 Historical Places in Nashik:");
                System.out.println("1. Trimbakeshwar Temple");
                System.out.println("2. Pandavleni Caves");
                System.out.println("3. Kalaram Temple");
                System.out.println("4. Anjaneri Fort");
                System.out.println("5. Sita Gufa");
		break;
			}
			
		case "Delhi" :
			{
				System.out.println("Top 5 Historical Places in Delhi:");
                System.out.println("1. Red Fort");
                System.out.println("2. Qutub Minar");
                System.out.println("3. India Gate");
                System.out.println("4. Humayun's Tomb");
                System.out.println("5. Purana Qila");
		break;
			}
		
		}
	}
}
