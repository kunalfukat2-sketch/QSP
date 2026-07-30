import java.util.Scanner;

class LeapYear 
{
	public static void main(String[] args) 
	{
//		Actual value of one year days contains is = 365.2425 Days
//			
//		Calculaction = 365.25 Days
//			
//		 1st year 365.25
//			 
//		 2nd year 365.25
//			 
//		 3rd year 365.25
//			 
//		 4th year 365.35
//			 
//		 so the above year contain extra .25 value and we add the all extra values of up to 4th year 
//		 0.25+0.25+0.25+0.25 = 1day so thet one 1extra day add in 4th year thaths why the every 4th year is a leap year
//			 
//		 so we calculate the value using calculates value that is 365.25 but accual value is 365.2425 so the difference is 365.25 - 365.2425 =  0.0075  
//		 so we found the error of 0.0075 days per year is extra so 
//			 
//		 after 100 years its 0.0075*100 = 0.75 it equals to the 18hrs 
//		 after 200 years its 0.0075*200 = 1.5 it equals to the 1.5 Day 
//		 after 300 years its 0.0075*300 = 2.25 it equals to the 2.25 Day
//		 after 400 years its 0.0075*400 = 3 it equals to the  3Days 
//			 
//		 so the 100,200,300 is also leap year but we found 3 days extra so we can substract the 3 year form 100,200,300 .
//		 from each 100 year we reduce 1year to avoide the eextra 3 years or error so we cant consider the 100,200,300 is not a leap year 
//		 only divvisable by 400 is a leap year
//		 so we found the extra 3 days after 400years so we can substract the day  
//
		 
			
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a Year :");
		int year = sc.nextInt();
		
		if((year % 4 ==0 && year % 100 !=0 )|| (year % 400 ==0))
		{
			System.out.println("The "+year+" Year is Leap Year");
		}
		else
			{
			System.out.println("The " +year+ " Year is Not a leap year");
		}
		
		
	}
}
