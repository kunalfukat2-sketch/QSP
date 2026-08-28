class Static1
{
	static String str = "Static variable";
	
	static{
		System.out.println("Static block ");
		
	}
	
	
	public static void m1(){
		System.out.println("m1() static method");
	}
	
	static class InnerClass
	{
		public static void m2(){
			System.out.println("Inner class ");
		}
	} 
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(str);
		m1();
		InnerClass.m2();
	}
}