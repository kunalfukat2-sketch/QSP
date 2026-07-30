// Take a Charachter  input form the user in Scanner class and weather the characther is vowles or Consonents

import java.util.Scanner;

class VowelsConsonent
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter a Cherechter : ");
		char ch = sc.next().charAt(0);
		
		if( ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e'|| ch=='i'|| ch=='0'|| ch=='u')
		{
			System.out.println(" The Chatarachter is Vowels");
		}
		else
		{
			System.out.println(" The Chatarachter is Consenents");
		}
	}
}


  // by using Conditional operator
  
  
  
import java.util.Scanner;

class VowelsConsonent
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter a Cherechter : ");
		char ch = sc.next().charAt(0);
		
		String result = ( ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e'|| ch=='i'|| ch=='0'|| ch=='u') ? ("Vowles"):("consonents");
		Sysrtem.out.println( result);
	}
}
