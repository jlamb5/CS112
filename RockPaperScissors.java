import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {

	public static void main (String[]args){
		
	String myhand="";//computers random hand
	String yourhand;//user's choice input
	int compGenerated;
	
	Random rand = new Random();
	
	Scanner scan = new Scanner(System.in);
	
		
	System.out.println("Lets play a game of rock, paper, scissors!");	
	System.out.println("Your Move!");
	System.out.println("Rock = R, Paper = P, Scissors = S");
	
	compGenerated = rand.nextInt(3)+1;//creates an integer to generate an output
	System.out.println(" #1");
	//translates integer to a character, in order to compare hands
	if (compGenerated==1)
		myhand="R";
	if (compGenerated==2)
			myhand="P";
	if (compGenerated==3)
			myhand="S";
	
	System.out.println("Please chose a move!\n");
	yourhand = scan.next();
	
	System.out.println(" #2");
	System.out.println("I chose " + myhand);
	System.out.println(" #2.1");
	//compares hands to determine a winner
		if (yourhand.equals(myhand)) 
	       System.out.println("It's a tie!");
	    else if (yourhand.equals("R")) 
	       {
	    	if (myhand.equals("S")) 

	          System.out.println("Rock crushes scissors. You win!!");
	    else if (myhand.equals("P")) 
	            System.out.println("Paper eats rock. You lose!!"); 
	       }
	    else if (yourhand.equals("P")) 
	    {
	    		       if (myhand.equals("S")) 
	       System.out.println("Scissor cuts paper. You lose!!"); 
	    else if (myhand.equals("R")) 
	            System.out.println("Paper eats rock. You win!!"); 
	    }
			   
		else if (yourhand.equals("S")) 
	    {
	         if (myhand.equals("P")) 
	         System.out.println("Scissor cuts paper. You win!!"); 
	    else if (myhand.equals("R")) 
	            System.out.println("Rock breaks scissors. You lose!!"); 
	    }
		System.out.println(" #3");
		
		}
	}


	
