
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiates a new circle object  (stores circle and it knows its radius)
		
		//CIRCLE
		Circle circOne = new Circle (3.0);
		Circle circTwo = new Circle (20.0);
		Circle circThree = new Circle (-4.0);
		
		System.out.println(Circle.getCircle());
	
		System.out.println(circOne.getRadius());
		System.out.println(circThree.getRadius());
		System.out.println(circTwo.getRadius());
	
		System.out.println(circOne.getDiameter());
		System.out.println(circTwo.getDiameter());
		System.out.println(circThree.getDiameter());
		
		System.out.println(circOne.getArea());
		System.out.println(circTwo.getArea());
		System.out.println(circThree.getArea());
		
		System.out.println(circOne.getCircumfrence());
		System.out.println(circTwo.getCircumfrence());
		System.out.println(circThree.getCircumfrence());

		//SQUARE
		/*
		 * this is my first shape it is a Square
		 */
		Square squaOne = new Square (4.0);
		Square squaTwo = new Square (7.5);
		Square squaThree = new Square (-6.0);
		
		//System.out.println(Square.getSquare());
		System.out.println
		
		//this will print out the area of squares 1-3
		System.out.print("this is the area of squares 1-3, ");
		System.out.print(squaOne.getArea());
		System.out.print(", ");
		System.out.print(squaTwo.getArea());
		System.out.print(", ");
		System.out.println(squaThree.getArea());
		
		//this will print out the parameter of squares 1-3
		System.out.print("this is the perimeter of squares 1-3, ");
		System.out.print(squaOne.getPerimeter());
		System.out.print(", ");
		System.out.print(squaTwo.getPerimeter());
		System.out.print(", ");
		System.out.println(squaThree.getPerimeter());
		
		//RECTANGLE
		/*
		 * this is my second shape it is a Rectangle 
		 */
		//System.out.println(Rectangle.getRectangle());
		Rectangle recOne = new Rectangle (6.0, 4.0);
		Rectangle recTwo = new Rectangle (3.5,4.3);
		Rectangle recThree = new Rectangle (8.5,3.0);
		
		//this will print out the area of rectangles 1-3
		System.out.print("this is the area of rectangles 1-3, ");
		System.out.print(recOne.getArea());
		System.out.print(", ");
		System.out.print(recTwo.getArea());
		System.out.print(",");
		System.out.print(recThree.getArea());
		
		//this will print out the parameter of rectangles 1-3
		System.out.println();
		System.out.print("this is the perimeter of rectangles 1-3, ");
		System.out.print(recOne.getPerimeter());
		System.out.print(" ,");
		System.out.print(recTwo.getPerimeter());
		System.out.print(" ,");
		System.out.println(recThree.getPerimeter());
		
		//CYLINDER
		/* 
		 * this is my third shape it is a cylinder
		 */
		Cylinder cylOne = new Cylinder (9.0,8.0);
		Cylinder cylTwo = new Cylinder (5.0,6.0);
		Cylinder cylThree = new Cylinder (4.0,2.0);
		
		//this will print out the surface of cylinders 1-3
		System.out.print("this is the surface of cylinders 1-3, ");
		System.out.print(cylOne.getSurface());
		System.out.print(", ");
		System.out.print(cylTwo.getSurface());
		System.out.print(",");
		System.out.print(cylThree.getSurface());
		
		//this will print out the volume of cylinders 1-3
		System.out.print("this is the volume of cylinders 1-3, ");
		System.out.print(cylOne.getVolume());
		System.out.print(", ");
		System.out.print(cylTwo.getVolume());
		System.out.print(",");
		System.out.print(cylThree.getVolume());
		
		//CUBE
		/*
		 * this is my fourth shape it is a cube
		 */
		Cube cuOne = new Cube (3.0,3.0);
		Cube cuTwo = new Cube (4.0,6.0);
		Cube cuThree = new Cube (5.,1.0);
		
		//this will print out the volume of cubes 1-3
		System.out.print("this is the volume of cubes 1-3, ");
		System.out.print(cuOne.getVolume());
		System.out.print(", ");
		System.out.print(cuTwo.getVolume());
		System.out.print(",");
		System.out.print(cuThree.getVolume());
	
		//this will print out the parameter of cubes 1-3
		System.out.println();
		System.out.print("this is the perimeter of cubes 1-3, ");
		System.out.print(cuOne.getPerimeter());
		System.out.print(" ,");
		System.out.print(cuTwo.getPerimeter());
		System.out.print(" ,");
		System.out.println(cuThree.getPerimeter());
		
		//TRIANGLE
		/*
		 * this is my fifth shape it is a triangle
		 */
		 Triangle triOne = new Triangle (9.0, 8.0, 1.0, 2.0);
		 Triangle triTwo = new Triangle (4.0,3.0,1.0,2.0);
		 Triangle triThree = new Triangle (2.0, 6.0, 1.0, 2.0);
		 
		//this will print out the area of triangles 1-3
		System.out.print("this is the area of triangles 1-3, ");
		System.out.print(triOne.getArea());
		System.out.print(", ");
		System.out.print(triTwo.getArea());
		System.out.print(",");
		System.out.print(triThree.getArea());
			
		//this will print out the parameter of cubes 1-3
		System.out.println();
		System.out.print("this is the perimeter of triangle 1-3, ");
		System.out.print(cuOne.getPerimeter());
			System.out.print(" ,");
			System.out.print(cuTwo.getPerimeter());
			System.out.print(" ,");
			System.out.println(cuThree.getPerimeter());
			
}
	
	
	

}
