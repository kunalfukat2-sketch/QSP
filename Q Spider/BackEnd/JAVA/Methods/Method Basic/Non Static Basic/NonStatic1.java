class NonStatic1
{
	String str  = "Non static var";
	
	{
		System.out.println("non satic block");	
	}
	
	public void m1(){
		System.out.println("m1() non-static Outerclass");
	}
	
	class InnerClass{
		
		public void m3(){
			System.out.println("m3()");
		}
	}
	
	public void m2(){
			System.out.println("m2() static method Outerclass");
			Demo2 obj = new Demo2();
			obj.m1();
			System.out.println(obj.str);
			InnerClass obj1 = new InnerClass();
			obj1.m3();
		    
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("main()");
		m2();

	}
}