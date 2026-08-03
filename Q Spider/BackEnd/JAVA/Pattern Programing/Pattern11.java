import java.util.Scanner;
class Pattern11 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a Numbers Of Row : ");
		 int n = sc.nextInt();
		 
		 int b = (n*2) - 1;
		 
		 int c = 1;
		 
		 for (int i= 1; i<=n;i++ )
		 {
			 int a = i;
			 
			 for (int j= 1;j<=n ;j++ )
			 {
				 System.out.print(a + " " );
				 if(a<=9) System.out.print(" ");
				 
				a =  (j%2!=0) ? (a+=b) : (a+=c);
				 
			 }
			b-=2;
			c+=2;
			 
			System.out.println();
		 }
	}
}
