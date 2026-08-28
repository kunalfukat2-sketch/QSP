class Demo2 
{   
	//Non-Static Variable
	String str = "Non-Static Variable";
	
	//Non-Static Block
	{
		System.out.println("Non-Static Block");
	}
	
	//Non-static Method
	public void m1(){
		System.out.println("m1() Non-static Method");
	}
	
	// Static Method
	public static void m2(){
		System.out.println("m2() Static Method");
	}
	
	// main Method
	public static void main(String[] args) 
	{
		System.out.println("Main Method ");
		Demo2 obj = new Demo2();
		obj.m1();
	}
}
