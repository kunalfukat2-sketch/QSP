
class PowerRange 
{
	public static void main(String[] args) 
	{
		    int num = 123;
			int temp = num;
			int temp1= num;
			int count = 0;
			int sum = 0 ;

			
			while (temp!=0)
			{
					count++;
				temp/=10;
			}
			
			while (temp1 != 0)
			{
				
		    	int base = temp1 % 10;
		    	int power = count;
		    	int ans = 1;
		    	
		    	
		    	for (int i= 1; i <= power ; i++ )
		    	{
		    		ans = ans * base;
		    		
		    	}
				
				sum = sum + ans;
				
				temp1 = temp1/10;
		    		
		      
		    }
			
			System.out.println(sum); 
		    	
		    	
		}    
	}
