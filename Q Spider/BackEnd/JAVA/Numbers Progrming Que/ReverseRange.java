// Revers all the number form 200 to 500


class ReverseRange 
{
	public static void main(String[] args) 
	{
		for ( int num = 200 ; num <= 500  ; num++ )
		{
			int rev =0;
			int temp = num;
			
			while (temp!=0)
			{
				int last = temp % 10;
				
				rev = rev * 10 + last;
				
				temp = temp / 10;
			}
			
			System.out.println(rev);
		}
	}
}
