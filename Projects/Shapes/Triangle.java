
public class Triangle {
	//data attributes
	private final double base = 5;
	private double sideOne = 1;
	private double sideTwo = 2;
	private double sideThree = 3;
	private double height;
	
	//constructor
	public Triangle (double h, double a, double b, double c)
	{
		height = h;
		sideOne = a;
		sideTwo = b;
		sideThree = c;
	}
	
	/** 
	 * this method will return the area of a triangle
	 * @return the area
	 */
	public double getArea()
	{
		return 0.5*base*height;
	}
	/**
	 * this method will return the parameter of a triangle
	 * @return the parameter
	 */
	public double getPerimeter()
	{
		return sideOne+sideTwo+sideThree;
	}
	
	public static String getTriangle()
	{
		return  "Triangle";
	}
	
}
