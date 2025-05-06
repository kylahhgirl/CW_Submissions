public class Game_Tile {

	private boolean hasPlayer;
	
	private boolean isRevealed;
	
	private boolean isWall;
	
	public Game_Tile(boolean p, boolean r, boolean w)
	{
		hasPlayer = p; 
		isRevealed = r; 
		isWall = w;
	}

	public boolean isHasPlayer() {
		return hasPlayer;
	}

	public void setHasPlayer(boolean hasPlayer) {
		this.hasPlayer = hasPlayer;
	}

	public boolean isRevealed() {
		return isRevealed;
	}

	public void setRevealed(boolean isRevealed) {
		this.isRevealed = isRevealed;
	}

	public boolean isWall() {
		return isWall;
	}

	public void setWall(boolean isWall) {
		this.isWall = isWall;
	}
	
	public String toString()
	{
		if (hasPlayer == true)
		{
			return " $ ";
		}
		if (isRevealed == false)
		{
			return " * ";
		}
		else if (isRevealed == true)
		{
			if (isWall == true)
			{
				return " # ";
			}
			else if (isWall == false)
			{
				return " % ";
			}
		}
		return "anyKineString";
	}
}
