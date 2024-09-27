
public class Cube {
	//data attributes
	private final double side = 5;
	private double length;
	
	//constructors
	public Cube (double l, double s)
	{
		length = l;
		side = s;
	}

	//functionality
	
	/**
	 * this method will return the volume of a cube
	 * @return the volume
	 */
	public double getVolume()
	{
	return side*side*side;
	}

	/**
	 * this method will return the parameter of a cube
	 * @return the parameter
	 */
	public  double getPerimeter()
	{
	return 12*length;
	}
}
