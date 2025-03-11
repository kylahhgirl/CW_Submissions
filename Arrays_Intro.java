
public class Arrays_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//(1) create arrays for double, ints, booleans, strings, and circles class
		int [] intArr = {};
		double [] doubArr = {};
		String [] stringArr = {};
		boolean [] booleanArr = {};
		//Circle [] circleArr = {};
		
		
		//(2) array of numbers with the required values
		int [] numArr = {7, -12, 88, -88, 0, 5, 2000};
		System.out.println(intArr[intArr.length-1]);
		

		//(3) arrat that represents 5 String objects with default value
		String [] fruitsArr = new String [5];
		
		System.out.print(fruitsArr);
		
		
		//(4)
		fruitsArr[1] = "Bapple";
		
		
		//(5) this prints the last word in array
		fruitsArr[fruitsArr.length-1] = "Zanana";
		System.out.println(fruitsArr[fruitsArr.length-1]);
		
		
		//(6) verify (4)
		System.out.println(fruitsArr[1]);
		
		
		//(7) loop that one by one prints out each element of fruitsArr
		for(int i = 0; i<=fruitsArr.length-1; i++)
		{ 
			System.out.print(fruitsArr[i]);
		}
		
	}
		
}
