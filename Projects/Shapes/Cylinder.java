
public class Cylinder {
//data attributes
	private final double pi = 3.14159;
	private double radius;
	private double height;
	
//constructors
	public Cylinder(double r, double h)
	{
		radius = r;
		height  = h;
	}
	
	/**
	 * this method will return the surface of a cylinder
	 * @return the surface
	 */
	public double getSurface()
	{
		return 2*pi*radius*(radius+height);
	}
	
	/**
	 * this method will return the volume of a cylinder
	 * @return the volume
	 */
	public double getVolume()
	{
		return pi*radius*radius*height;
	}
	
}
