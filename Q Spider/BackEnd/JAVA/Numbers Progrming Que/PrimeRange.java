// Print the prime number between range 100 - 150;


class PrimeRange 
{
	public static void main(String[] args) 
	{
		for (int num = 100 ; num <= 150 ; num++ )
		{
		     int count = 2;
			 
			 for (int i=2 ; i < num ; i++ )
			 {
				 if (num % i == 0)
				 {
					 count ++;
					 
				 }
			 }
			 if (count == 2)
			 {
				 System.out.println(num);
			 }
		}
	}
}
