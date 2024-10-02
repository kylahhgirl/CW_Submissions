public class Non_Void_Method_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//task 1:
	System.out.println(stateName());
	System.out.println(stateEyeColor());
	System.out.println(stateHairStyle());
	System.out.println(FavoriteFood());
	
//task 2:
	final double pi = 3.14159;
	double radius  = (8.0);
	double diameter = calDiameter (radius);
	double circumference = calCircumference (pi, radius);
	double area =  calArea (radius, pi);
	System.out.print("The diameter is " + diameter + ". The circumference is " + circumference + ". The area is "  + area + ".");
	}
	{
//task 3:
	int x = 2;
	int y = 5;
	findSum (x,y);
	findDifference (x,y);
	findProduct (x,y);
	findQoutient (x,y);
	findModules(x,y);
	}
		
//this is task 1, it wills state my name,  eye color, hair style, best friends and favorite food
	public static String stateName() {
		
		return "My name is Kylah";
	}
	public static String stateEyeColor() {
	
		return "My eyes are brown";
	}
	public static String FavoriteFood() {

		return "My favoirite food is pizza";
	}
	public static String stateHairStyle() 
	{
		return "My hair is braided";
	}
	public static String stateBestFriend()
	{
		return "My best friend is my sister";
	}
	
	
//this is task 2- this prints circle stats
	public static double calDiameter (double r)
	{
		return r+r;
	}
	
	public static double calCircumference(double pile, double rando)
	{
		return 2*pile*rando;
	}
	
	public static double calArea(double red, double pink)
	{
		return pink*red*red;
	}

	//this is task 3- this prints math stuffs
	public static double findSum(int x, int y)
	{
		return (x+y);
	}
	
	public static double findDifference (int x, int y)
	{
		return (x-y);
	}
	
	public static double findProduct(int x, int y)
	{
		return (x*y);
	}

	public static double findQoutient(int x, int y)
	{
		return (x/y);
	}
	
	public static double findModules(int x, int y)
	{
		return (x%y);
	}
}
	
 
 			
 			
