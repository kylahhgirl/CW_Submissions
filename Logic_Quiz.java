
public class logic_quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(findIfIsLeapYear(100));
	}
	public static boolean findIfIsLeapYear(int year)
	{
		if (year  % 400  == 0)
		{
			return true;
		}
		
		else if (year % 100 == 1)
		{
			return false;
		}
		
		else if (year % 4 == 0)
		{
			return true;
		}
		
		else
		{
			return  false;
		}
	}
}
