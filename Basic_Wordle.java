import java.util.Scanner;
public class Wordle {

	static Scanner gameReader = new Scanner (System.in);
	
	public static void main(String[] args) {
	
	String soln = new String ("water");
	System.out.print("Welcome to Wordle Land");
	playGame();
	playerGuess(soln);
	

	}
	
	public static void playGame ()
	{
		System.out.print("Make a guess");
	}

	public static String possibleErrors ()
	{
		String guess = new String (gameReader.next());
		
		if (guess.length() !=5)
		{
			System.out.print("Guess a word with five letters");
		}
		
		else if (guess.charAt(0)==guess.charAt(1)||guess.charAt(0)==guess.charAt(2)||guess.charAt(0)==guess.charAt(3)||guess.charAt(0)==guess.charAt(4))
		{
			System.out.print("That word has repeating letters");
		}
		
		else if (guess.charAt(1)== guess.charAt(2)||guess.charAt(1)== guess.charAt(3)||guess.charAt(1)== guess.charAt(4))
		{
			System.out.print("That word has repeating letters");
		}
		
		else if (guess.charAt(2)== guess.charAt(3)||guess.charAt(2)== guess.charAt(4))
		{
			System.out.print("That word has repeating letters");
		}
		
		else if (guess.charAt(3)== guess.charAt(4))
		{
			System.out.print("That word has repeating letters");
		}
		
		return guess;
	}
	
	public static void playerGuess (String soln)
	{
		String guess = possibleErrors();
		
		if (guess.charAt(0)== soln.charAt(0))
		{
			System.out.print(soln.charAt(0));
		}
		
		else if (guess.charAt(0)==soln.charAt(1)||guess.charAt(0)==soln.charAt(2)||guess.charAt(0)==soln.charAt(3)||guess.charAt(0)==soln.charAt(4))
		{
			System.out.print("?");
		}
		
		else if (guess.charAt(0)!=soln.charAt(0))
		{
			System.out.print("X");
		}
		
		//second letter
		if (guess.charAt(1)== soln.charAt(1))
		{
			System.out.print(soln.charAt(1));
		}
		
		else if (guess.charAt(1)==soln.charAt(0)||guess.charAt(1)==soln.charAt(2)||guess.charAt(1)==soln.charAt(3)||guess.charAt(1)==soln.charAt(4))
		{
			System.out.print("?");
		}
		
		else if (guess.charAt(1)!=soln.charAt(1))
		{
			System.out.print("X");
		}
		
		//third letter
		if (guess.charAt(2)== soln.charAt(2))
		{
			System.out.print(soln.charAt(2));
		}
		
		else if (guess.charAt(2)==soln.charAt(0)||guess.charAt(2)==soln.charAt(1)||guess.charAt(2)==soln.charAt(3)||guess.charAt(2)==soln.charAt(4))
		{
			System.out.print("?");
		}
		
		else if (guess.charAt(2)!=soln.charAt(2))
		{
			System.out.print("X");
		}
		
		//fourth letter
		if (guess.charAt(3)== soln.charAt(3))
		{
			System.out.print(soln.charAt(3));
		}
		
		else if (guess.charAt(3)==soln.charAt(0)||guess.charAt(3)==soln.charAt(1)||guess.charAt(3)==soln.charAt(2)||guess.charAt(3)==soln.charAt(4))
		{
			System.out.print("?");
		}
		
		else if (guess.charAt(3)!=soln.charAt(3))
		{
			System.out.print("X");
		}
		
		//fifth letter
		if (guess.charAt(4)== soln.charAt(4))
		{
			System.out.print(soln.charAt(4));
		}
		
		else if (guess.charAt(4)==soln.charAt(0)||guess.charAt(4)==soln.charAt(1)||guess.charAt(4)==soln.charAt(2)||guess.charAt(4)==soln.charAt(3))
		{
			System.out.print("?");
		}
		
		else if (guess.charAt(4)!=soln.charAt(4))
		{
			System.out.print("X");
		}
		
		if (guess.charAt(0)==soln.charAt(0)&& guess.charAt(1)==soln.charAt(1)&& guess.charAt(2)==soln.charAt(2)&& guess.charAt(3)==soln.charAt(3)&& guess.charAt(4)==soln.charAt(4))
		{
			System.out.print("Congratulations you beat Wordle Land!");
		}
		
		else 
		{
			playerGuess (soln);
		}
	}
	
	
	
}
