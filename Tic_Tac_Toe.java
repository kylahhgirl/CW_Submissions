import java.util.Scanner;

public class Tic_Tac_Toe {
	
	static Scanner myReader = new Scanner(System.in);
	static boolean turnOn = true;
	
	//keeps track of amount of times a move is done
	static int count = 0;

	public static void main(String[] args) {
		
		String [][] grid =
		{
			{"[]", "[]",  "[]"},
			{"[]", "[]",  "[]"},
			{"[]", "[]",  "[]"}
		};
		
		printGrid(grid);
		System.out.println("Let's play tic-tac-toe!");
		System.out.println("Player 1 is X and Player 2 will be 0");
		
		playerxRow (grid);
		
	}
	public static void printGrid(String[][] arr)
	{
		//this for loop will run a long as i is less than the length of the first rows length-1
		for(int i = 0; i<=arr[0].length-1; i++)
		{
			//this line of code will run after the for loop above runs
		   //this line of code will run as long as r is less than or equal to length-1
			for (int r = 0; r<=arr.length-1; r++)
			{ 
				//then this line will print the r and i
				System.out.print(arr[i][r]);
			}
			
			System.out.println();
		}

	}
	
	public static void playerxRow(String[][] arr)
	{
		System.out.print("What row do you wanna place your X in?");
		int xRow = myReader.nextInt();
		myReader.nextLine();
		
		if (xRow > 3 || xRow < 1) 
		{
		System.out.print("Number is invalid. Try again.");
		playerxRow (arr);
		}
		
		else 
		{
			playerxColumn (arr, xRow);
		}
	}
	
	public static void playerxColumn(String[][] arr, int xRow)
		{
			System.out.print("What column do you wanna place your X in?");
			int xColumn = myReader.nextInt();
			myReader.nextLine();
			
			if (xColumn > 3 || xColumn < 1) 
			{
				System.out.print("Number is invalid. Try again.");
			playerxColumn (arr,xRow);
			}
			
			else if(arr[xRow-1][xColumn-1] == " X " || arr[xRow-1][xColumn-1] == " O ")
			{
				System.out.println("That spot has already been taken. Try again.");
				playerxRow(arr);
			}
			
			else
			{
				count ++;
				arr[xRow-1][xColumn-1] = " X ";
				printGrid (arr);
				if (!playerWins(arr))
				{
					playeroRow(arr);
				}
				
				
			}
	}
	
	public static void playeroRow(String[][] arr)
	{
		System.out.print("What row do you wanna place your O in?");
		int oRow = myReader.nextInt();
		myReader.nextLine();
		
		if (oRow > 3 || oRow < 1) 
		{
		System.out.print("Number is invalid. Try again.");
		playeroRow (arr);
		}
		
		else 
		{
			playeroColumn (arr, oRow);
		}
	}
	
	public static void playeroColumn(String[][] arr, int oRow)
		{
			System.out.print("What column do you wanna place your O in?");
			int oColumn = myReader.nextInt();
			myReader.nextLine();
			
			if (oColumn > 3 || oColumn < 1) 
			{
				System.out.print("Number is invalid. Try again.");
			playeroColumn (arr,oRow);
			}
			
			else if(arr[oRow-1][oColumn-1] == " X " || arr[oRow-1][oColumn-1] == " O ")
			{
				System.out.println("That spot has already been taken. Try again.");
				playeroRow(arr);
			}
			
			else
			{
				count ++;
				arr[oRow-1][oColumn-1] = " O ";
				printGrid (arr);
				if (!playerWins(arr))
				{
					playerxRow(arr);
				}
			}
	}
	
	public static boolean playerWins(String[][] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[0][i] ==  " X " && arr[0][i] == arr [1][i] && arr[1][i] == arr[2][i])
			{
				System.out.println("Player 1 wins!");
				return true;
			}
			else if (arr[0][i] ==  " O " && arr[0][i] == arr [1][i] && arr[1][i] == arr[2][i])
			{
				System.out.println("Player 2 wins!");
				return true;
			}
		}
			
		for (int i = 0; i < arr[0].length; i++)
			{
				if (arr[i][0] ==  " X " && arr[i][0] == arr [i][1] && arr[i][1] == arr[i][2])
				{
					System.out.println("Player 1 wins!");
					return true;
				}
				else if (arr[i][0] ==  " O " && arr[i][0] == arr [i][1] && arr[i][1] == arr[i][2])
				{
					System.out.println("Player 2 wins!");
					return true;
				}
			}
				
		if (arr[2][0] == " X " && arr[2][0] == arr[1][1] &&  arr[1][1] == arr[0][2])
		{
			System.out.println("Player 1 wins!");
			return true;
		}
		else if (arr[2][0] == " O " && arr[2][0] == arr[1][1] && arr[1][1] == arr[0][2])
		{
			System.out.println("Player 2 wins!");
			return true;
		}
		
		if (arr[0][0] == " X " && arr[0][0] == arr[1][1] &&  arr[1][1] == arr[2][2])
		{
			System.out.println("Player 1 wins!");
			return true;
		}
		else if (arr[0][0] == " O " && arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2])
		{
			System.out.println("Player 2 wins!");
			return true;
		}
		else if (count == 9)
		{
			System.out.println("It's a draw...");
			return true;
		}
		return false;
		
		
}
}
