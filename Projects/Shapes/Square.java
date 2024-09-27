
public class Square {
	//data attributes
	private final double length = 4;
	private double width;
	
	//constructor
	public Square (double w)
	{
		width  = w;
	}
	
	//functionality
	/** 
	 * this method will return the area of a square
	 * @return the area
	 */
	public double getArea()
	{
		return length*width;
	}
	/**
	 * this method will return the perimeter of a square
	 * @return the perimeter
	 */
	public double getPerimeter()
	{
		return 2*length+width;
	}
	
	public static String getSquare()
	{
		return  "Square";
	}
	
}
