
public class Methods_Intro_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stateName();
		stateHairStyle();
		stateFavoriteFood();
		printCircleStats(13.0);
		printMathStuffs(4,5);

	}
	
//  Task 1: Create a void method that prints name, eye color, hair style,  best friend, and  favorite  food.
	
	public static void stateName() { 
		System.out.println("my name is Kylah");
		
			}
	public static void stateEyeColor() {
	System.out.println("my eye color is brown");
	
	}
	public static void stateHairStyle() {
		System.out.println("my hair is in two braids");
		
	} 
	public static void stateBestFriend() {
		System.out.println("my best friend is my sister");
		
	}
	public static void stateFavoriteFood() {
		System.out.println("my favorite food is pizza");
	}
	
// Task 2: Create a void method printCircleStats() that is passed a double and calculates then prints out the r, d, c, and a of the circle.
	
	public static void printCircleStats(double r) 
	{
		final double pi = 3.14159;
		double d = 2*r;
		double c = 2*pi*r;
		double a = pi*r*r;
		
		System.out.println("the radius is " + r );
		System.out.println("the diameter is " + d);
		System.out.println("the curcumfrence is "+ c);
		System.out.println("the area is "  + a);
	
	}
	
// Task 3: Create a void method printMathStuffs() that is passed two ints and prints their s, d, p, q, and r.		
	
	public static void printMathStuffs(int i, int t) 
	{
		int sum = i+t;
		int diff = i-t;
		int product = i*t;
		int  quo = i/t;
		int remain = i%t;
		
		System.out.print("the sum is "+sum+", the difference is "+diff+", the product is "+product+", the  quo is  "+quo+", the reaminder is "+remain);
				
	}
}
