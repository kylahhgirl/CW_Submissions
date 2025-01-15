
public class strings_loops_corrections {

	public static void main(String[] args) {
		
	String myString = new String("abc123");
	System.out.print(giveBackwards(myString));
	
	}
	public static String giveBackwards(String str)
	{
		int n = str.length()-1;
		String space = "";
		for (int i = n; i > -1; i--)
		{ 
			space += str.charAt(i);
		}
		return space;
	}
}
