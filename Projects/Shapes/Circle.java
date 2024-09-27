
public class Circle { 
	//data attributes
	private final double pi = 3.14159;
	private double radius;
	
	//constructor
	public Circle(double r)
	{
		radius = r;
	}
	
	//functionality
	public double getRadius()
	{
		return radius;
	}
	
	public double getDiameter()
	{
		return 2*radius; 
	}
	
	public double getArea()
	{
		return pi*radius*radius;
	}
	
	public double getCircumfrence()
	{
		return 2*pi*radius;
	}
	
//static means it does not depend on a specific object
	public static String getCircle()
	{   
		return "Circle";
	}

	public double getPi() {
		return pi;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
	
}
