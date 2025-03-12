
public class Searching_Arrays_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	}
	
	//1. Create a method checkFor4() that is passed an int array 
	//and returns true if that array has a 4 and false if that array has no 4's. 
	
	public static boolean checkFor4(int[] arr)
	{
		int [] copArr = arr;
		boolean has4 = false;
		
		for (int i = 0; i < copArr.length; i++)
		{
			if (copArr[i] == 4)
			{
				has4 = true;
			}
		}
		
		return has4;
	}
	

	//2. Create a method countFor4() that is passed an int array and 
	//returns how many times 4 shows up in the array. 
	
	public static int countFor4(int[] arr)
	{
		int [] copArr = arr;
		int countOf4 = 0;
		
		for (int i = 0; i < copArr.length; i++)
		{
			if (copArr[i] == 4)
			{
				countOf4++;
			}
		}
		return countOf4;
	}
	
	//3. Create a method checkForFour4() that is passed an int array 
	//and return true if the array has exactly four 4's in it. 
	
	public static boolean checkForFour4(int[] arr)
	{
		int[] copArr = arr;
		int countOf4 = 0;
		
		for (int i = 0; i < copArr.length; i++)
		{
			if (copArr[i] == 4)
			{
				countOf4++;
			}
	}
		if (countOf4 == 4)
		{
			return true;
		}
		
		else
		{
			return false;
		}
		
	}
}
