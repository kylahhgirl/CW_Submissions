
public class Rectangle {
// data attributes
	private final double length;
	private final double width;
	
//constructors
	public Rectangle (double l, double w)
	{
		length = l;
		width = w;
	}
	
//functionality

/**
 * this method will return the parameter of a rectangle
 * @return  the parameter
 */
public double getPerimeter()
{
	return 2*(length+width);	
}

/**
 * this method will return the area of a rectangle
 * @return the area
 */
public double getArea()
{
	return length*width;
}
}
