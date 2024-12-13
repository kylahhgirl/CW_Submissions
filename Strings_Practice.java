import java.util.Scanner;
public class Strings_Practice {

	static Scanner myReader = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	questionOne();
	questionTwo();
	}
	public static void questionOne()
	{
		boolean match = true;
		int count = 0;
		while (match)
		{
			String userInput = new String(myReader.next());
			if (userInput.equals("stop"))
			{
				match = false;
			}
		count ++;
		System.out.print(count+userInput);
	
		}
	}
	
	public static void questionTwo()
	{
		Circle circ1 =  new Circle(3.0);
		System.out.print("The radius of the circle is " + circ1.getRadius());
		for (int i = 1; i  <= 5; i++)
		{
			double userInput = myReader.nextDouble();
			System.out.print(circ1.getRadius() + userInput);
			circ1.setRadius(circ1.getRadius() + userInput);
		}
	}
}
