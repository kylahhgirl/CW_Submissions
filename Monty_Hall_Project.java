import java.util.Scanner;
public class Monty_HallGame {
	static Scanner userReader = new Scanner(System.in);

	public static void main(String[] args) {
		// makes methods ints
		
		int winDoor=pickRandomDoor();
		int playerDoor=pickPlayerDoor();
		int rDoor=wrongDoor(playerDoor,winDoor);
		
		System.out.println("Your choice is door " + playerDoor );
		remainingDoor(rDoor);
		askToSwitch(winDoor, playerDoor);
		userReader.close();
	
	}
	//picks random door to be winner
	public static int pickRandomDoor()
	{ 
		return (int)(Math.random()*3)+1;
	}
	
	//where player picks their door
	private static int pickPlayerDoor()
	{
		System.out.println("Pick one door (1,2, or 3)."); 
		String playerGuess = new String(userReader.next());
	
		if (playerGuess.equals("1"))
		{
			return 1;
		}
		
		if (playerGuess.equals("2"))
		{
			return 2;
		}
		
		else if (playerGuess.equals("3"))
		{
			return 3;
		}
		
		return  0;
	}
	
	//reveals a wrong door
	
	public static int wrongDoor (int pDoor, int wDoor)
	{
		//if player picks door 1
		
		int eDoor = (int) (Math.random()*2);
		
		if (pDoor==1&& wDoor==2)
		{
			return 3;
		}
		
		else if (pDoor==1&& wDoor==3)
		{
			return 2;
		}
		
		else if (pDoor==1&& wDoor==1)
		{
			return (int) (Math.random()*2)+2;
		}
		
		//if player picks 2
		else if (pDoor==2&& wDoor==1)
		{
			return 3;
		}
		
		else if (pDoor==2&& wDoor==3)
		{
			return 1;
		}
		
		else if (pDoor==2&& wDoor==2)
		{
			if (eDoor==0)
			{
				return 1;
			}
			
			else 
			{
				return 3;
			}
		}
		
		//if player picks 3
		else if (pDoor==3&& wDoor==1)
		{
			return 2;
		}
		
		else if (pDoor==3&& wDoor==2)
		{
			return 1;
		}
		
		else if (pDoor==3&& wDoor==3)
		{
			return (int) (Math.random()*2)+1;
		}
		
		return 0;
	}
	//reveals remaining door
	public static void remainingDoor(int rDoor)
	{
		String userInput = new String (userReader.next());
		
		if (userInput.equals("OK"))
		{
			System.out.println("Door " + rDoor + " has nothing behind it.");
		}
		
		else
		{
			System.out.println("Door " + rDoor + " has nothing behind it.");
		}
	}
	//ask player if they want to switch or not
	public  static void  askToSwitch (int wDoor, int pDoor)
	{
		System.out.println("Do you wanna switch doors?");
		String userInput = new String (userReader.next());
		
		if (userInput.equals("yes") && wDoor == pDoor)
		{
			System.out.print(("you lose"));
		}
		
		else if (userInput.equals("yes") && wDoor != pDoor)
		{
			System.out.print(("you won"));
		}
		
		else if (userInput.equals("no") && wDoor == pDoor)
		{
			System.out.print(("you won"));
		}
		
		else if (userInput.equals("no") && wDoor != pDoor)
		{
			System.out.print(("you lose"));
		}
	}
	
	
}
