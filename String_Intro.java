import java.util.Scanner;

public class String_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//my scanner
	Scanner myReader = new Scanner(System.in);
	String myWord = new String(myReader.next());
		
	myReader.close();
	
	printSecondAndLastLetter(myWord);
	findTheEThat(myWord);
	getLength(myWord);
	printFirstAndLastThree(myWord);
	
	//this will print the second and last letter of my expression.
	}
	public static void  printSecondAndLastLetter(String a)
	{
		System.out.println("the second letter is " + a.charAt(1) + " and the last letter is " + a.charAt(a.length()-1) + "");
	}

	//this  will print the first 'e' character in my expression.
	public static void findTheEThat(String b)
	{
		System.out.println(b.indexOf("b"));
	}
	
	//this  will print the amount of characters in my expression.
	public static void getLength(String c)
	{
		System.out.println("my words length is " + c.length() + "");
	}
	
	//this will print the first and last three letters of my expression.
	public static void printFirstAndLastThree(String d)
	{
		System.out.print("the first letter is "  + d.charAt(0) +  " and the last three letters are " + d.substring(d.length()-3));
	}
	
	
}

