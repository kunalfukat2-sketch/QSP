class ConditionalOperetor 
{
	public static void main(String[] args) 
	{
		
		// Define :- Conditional Operator is Ternary Operator , It is use to Make a Decision.
		
		 
		 // For single value
		  
		  int num = 31;
		  
		  String result = (num%2)==0?"even":"odd";
		  System.out.println(result);
		  
		  
		  // Find Large of Two numbers
		  
		  int num1 = 30;
		  int num2 = 55;
		  
		  int Larger = num1>num2?num1:num2;
		  System.out.println(Larger);
		  
		  
		  // Find Small of Two Numbers
		  
		  int a1 = 78;
		  int a2 = 2;
		   
 	      int Small = a1<a2 ? a1 : a2;
		  System.out.println(Small);
		  
		  // find large value of three variables 
		  
		  int var1= 23;
		  int var2= 78;
		  int var3= 24;
		  
		  int Largest = var1>var2 ? (var1>var3 ? var1 : var2) : ( var2 > var3 ? var2 : var3 );
		  
		  System.out.println(Largest);
		  
		  
		  // Find Small value of Three Variables
		  
		  int v1 =63;
		  int v2 =89;
		  int v3 =2;
		  
		  int Smallest = v1<v2 ? ( v1<v3 ? v1 : v3) : ( v2<v3 ? v2 : v3);
		  System.out.println(Smallest);
		  
		  
		  // Find Lagrest value of Four variables 
		  
		  int s1 = 23;
		  int s2 = 33;
		  int s3 = 45;
		  int s4 = 78;
		  
		  int Lagrestt = s1>s2?(s1>s3?s1:s2?(s1>s4?s1:s4): (s2>s3?s2:s3?(s3>s4?s3:s4));
		  System.out.println(Largestt);
		  
		  
		
		
		
		
	}
}
