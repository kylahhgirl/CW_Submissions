import java.util.Scanner;
public class Main {
	static Scanner myReader = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game_Tile[][] maze = new Game_Tile [5][5];
		
		maze [0][0] = new Game_Tile(true, true, false);
		maze [0][1] = new Game_Tile(false, false, true);
		maze [0][2] = new Game_Tile(false, false, true);
		maze [0][3] = new Game_Tile(false, false, true);
		maze [0][4] = new Game_Tile(false, false, true);
		
		
		maze [1][0] = new Game_Tile(false, false, false);
		maze [1][1] = new Game_Tile(false, false, true);
		maze [1][2] = new Game_Tile(false, false, true);
		maze [1][3] = new Game_Tile(false, false, true);
		maze [1][4] = new Game_Tile(false, false, true);
		
		
		maze [2][0] = new Game_Tile(false, false, false);
		maze [2][1] = new Game_Tile(false, false, true);
		maze [2][2] = new Game_Tile(false, false, true);
		maze [2][3] = new Game_Tile(false, false, true);
		maze [2][4] = new Game_Tile(false, false, true);
		
		
		maze [3][0] = new Game_Tile(false, false, false);
		maze [3][1] = new Game_Tile(false, false, true);
		maze [3][2] = new Game_Tile(false, false, true);
		maze [3][3] = new Game_Tile(false, false, true);
		maze [3][4] = new Game_Tile(false, false, true);
		
		
		maze [4][0] = new Game_Tile(false, false, false);
		maze [4][1] = new Game_Tile(false, false, false);
		maze [4][2] = new Game_Tile(false, false, false);
		maze [4][3] = new Game_Tile(false, false, false);
		maze [4][4] = new Game_Tile(false, false, false);
		
		System.out.println("Welcome to the maze!");
		Player player = new Player();
		printGrid(maze);
		playerDirection(maze, player);
		
		
	}

	public static void printGrid(Game_Tile[][] arr)
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
	
	public static void playerDirection(Game_Tile[][] arr, Player player)
	{
		String choice = myReader.next();
		if (choice.equals("up"))
		{
			if (player.getRow() <= 0)
			{
				System.out.println("You're out of bounds. Try again.");
			}
			else
			{
				if (arr[player.getRow()-1][player.getColumn()].isWall() == true)
				{
					arr[player.getRow()-1][player.getColumn()].setRevealed(true);
					System.out.println("You've hit a wall. You haven't moved.");
				}
				else 
				{
					arr[player.getRow()-1][player.getColumn()].setRevealed(true);
					arr[player.getRow()-1][player.getColumn()].setHasPlayer(true);
					arr[player.getRow()][player.getColumn()].setHasPlayer(false);
					player.setRow(player.getRow()-1);
					System.out.println("Congrats, you've sucessfully moved!");
				}
			}
		}
		
		else if (choice.equals("down"))
		{
			if (player.getRow() >= 4)
			{
				System.out.println("You're out of bounds. Try again.");
			}
			else
			{
				if (arr[player.getRow()+1][player.getColumn()].isWall() == true)
				{
					arr[player.getRow()+1][player.getColumn()].setRevealed(true);
					System.out.println("You've hit a wall. You haven't moved.");
				}
				else 
				{
					arr[player.getRow()+1][player.getColumn()].setRevealed(true);
					arr[player.getRow()+1][player.getColumn()].setHasPlayer(true);
					arr[player.getRow()][player.getColumn()].setHasPlayer(false);
					player.setRow(player.getRow()+1);
					System.out.println("Congrats, you've sucessfully moved!");
				}
			}
		}
		
		else if (choice.equals("left"))
		{
			if (player.getColumn() <= 0)
			{
				System.out.println("You're out of bounds. Try again.");
			}
			else
			{
				if (arr[player.getRow()][player.getColumn()-1].isWall() == true)
				{
					arr[player.getRow()][player.getColumn()-1].setRevealed(true);
					System.out.println("You've hit a wall. You haven't moved.");
				}
				else 
				{
					arr[player.getRow()][player.getColumn()-1].setRevealed(true);
					arr[player.getRow()][player.getColumn()-1].setHasPlayer(true);
					arr[player.getRow()][player.getColumn()].setHasPlayer(false);
					player.setColumn(player.getColumn()-1);
					System.out.println("Congrats, you've sucessfully moved!");
				}
			}
		}
		
		else if (choice.equals("right"))
		{
			if (player.getColumn() >= 4)
			{
				System.out.println("You're out of bounds. Try again.");
			}
			else
			{
				if (arr[player.getRow()][player.getColumn()+1].isWall() == true)
				{
					arr[player.getRow()][player.getColumn()+1].setRevealed(true);
					System.out.println("You've hit a wall. You haven't moved.");
				}
				else 
				{
					arr[player.getRow()][player.getColumn()+1].setRevealed(true);
					arr[player.getRow()][player.getColumn()+1].setHasPlayer(true);
					arr[player.getRow()][player.getColumn()].setHasPlayer(false);
					player.setColumn(player.getColumn()+1);
					System.out.println("Congrats, you've sucessfully moved!");
				}
			}
		}
		
		else 
		{
			System.out.println("Invalid. Try again.");
		}
		
		printGrid(arr);
		
		if (player.getRow() == 4 && player.getColumn() == 4)
		{
			System.out.println("YESSAH! You wonnnn");
		}
		else 
		{
			playerDirection(arr, player);
		}
	}
}
