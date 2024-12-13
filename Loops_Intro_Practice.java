
public class Loops_Intro {

	public static void main(String[] args) {
		
		System.out.println(countLetters("vvvobvv", 'v'));
		int num = 5;
		System.out.println(getFactorial(num));
		String word = new String ("aabcd");
		System.out.print(getIfRepeats(word));
	}
	
	//Task 1; counts how  many times a certain letter appears in a String
	public static int countLetters(String str, char let)
	{
		int count = 0;
		for(int i = 0; i<str.length();i++)
		{
			if(let == str.charAt(i));	
			{
				count ++;
			}
		}
		return count;
	}
	
	//Task 2; factorial - take a number and multiply it by every number in its sequential order going down
	public static int getFactorial(int n)
	{
		int prod = n;
		
		for  (int i = n-1; i>0; i--)
		{
			prod = prod*(n-1);
			n--;
		}
		return prod;
	}
	
	//Task 3; return true if a String has two of the same letters next to each other, otherwise false
	public static boolean getIfRepeats(String str)
	{
		for (int i = 0; i < str.length() -1; i++)
		{
			if (str.charAt(i) == str.charAt(i+1))
			{
				return true;
			}
		}
		return false;
	}
	}



