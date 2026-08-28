import java.util.Scanner;
class StonePapperScissor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int   userCount=0;
		int   botCount =0;
		
		
	outerLoop:
		while (true)
		{
		  System.out.println(" \n WELCOME \n");
		  System.out.println("1.STONE \n2.PAPPER  \n3.SCISSOR");
		  System.out.print("Enter Your Option:");
		   
		  int userOption = sc.nextInt();
		  
		  String userResponse = "";
		  
		  switch (userOption)
		  {
		  case 1 -> userResponse = "STONE";
		  case 2 -> userResponse = " PAPPER";
		  case 3 -> userResponse = "SCISSOR";
		  default -> {
			  System.out.println("\n INVAILD RESPONSE \n");
			  continue outerLoop;}
		  
		  }
		  
		  // Boat Response
		  
		  int botOption = 0;
		  
		  while (true)
		  {
			  botOption = (int)(Math.random()*10);
			  if (botOption>=1 && botOption<=3)
			  {
				  break;
			  }
			  
			  String botResponse = "";
			  
			  switch (botOption)
			  {
			  case 1 -> botResponse = "STONE";
			  case 2 -> botResponse = "PAPPER";
			  case 3 -> botResponse = "SCISSOR";
			  }
			  
			  System.out.println("\n BOT     USER");
			  System.out.println("     " +botResponse+" "+userResponse);
			  
			  
			  //winner
			  if (   (userResponse.equals("STONE") && botResponse.equals("SCISSOR")  )
				  || (userResponse.equals("PAPPER") && botResponse.equals("STONE") )
				  || (userResponse.equals("SCISSOR") && botResponse.equals("PAPPER") ) )
			  {
				  System.out.println("\n           USER WON THE GAME !! \n");
				  userCount++;
			  }
			  else if (   (userResponse.equals("STONE") && botResponse.equals("SCISSOR")  )
				  || (userResponse.equals("PAPPER") && botResponse.equals("STONE") )
				  || (userResponse.equals("SCISSOR") && botResponse.equals("PAPPER") )  )
				  
			    {  
					System.out.println("\n           BOT WON THE GAME !! \n");
			  	    botCount++;
			    }
				
				else
				{
					System.out.print("\n           The Match Is  DRAW !! \n");
					
				}
				
				System.out.print("\n Do you What to Play Again (Y/N) : \n");
					char ch = sc.next().toUpperCase().charAt(0);
				if (ch=='N')
				{
					continue outerLoop;
				}
				else
			    {
			  	    break;
			    }
				
				
		       
		  }
		}
		
	}
}
