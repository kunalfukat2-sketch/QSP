class Demo1 
{
	
	 static String str = "Static Var";
	 
	 
	 static {
		 System.out.println("Static block");
	 }
	 
	 
	 static public void m1(){
		System.out.println("Static m1() Method OuterClass");
		//InnerClass.m2();
		System.out.println(str);
		
	 }
	
	
	static class InnerClass{
		
		public static void m2()
		{
			System.out.println("Static m2() InnerClass");
			m1();
		}
		
	}
	
	public static void main(String[] args) 
	{
		m1();
		
	}
}
