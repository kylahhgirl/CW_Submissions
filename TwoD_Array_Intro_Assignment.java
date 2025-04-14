
public class TwoD_Array_Intro_Assignment {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	//1. Instantiate a 2-D array gridNums that consists of 4 rows and 6 columns using the new keyword. 
	int[][] gridNums = new int[4][6];
	
	//2. Instantiate a 2-D array with the following values:

	//4   5    7

	//2  -1   8

	//0  1   3
	
	int[][] forGrid2Nums = new int[3][4];
	
	//row #1
		forGrid2Nums[0][0] = 4;
		forGrid2Nums[0][1] = 5;
		forGrid2Nums[0][2] = 7;
		forGrid2Nums[0][3] = 6;
	//row #2
		forGrid2Nums[1][0] = 2;
		forGrid2Nums[1][1] = -1;
		forGrid2Nums[1][2] = 8;
		forGrid2Nums[1][3] = 0;
	//row #3
		forGrid2Nums[2][0] = 0;
		forGrid2Nums[2][1] = 1;
		forGrid2Nums[2][2] = 3;
		forGrid2Nums[2][3] = 4;
		
	//3. For both of those arrays, change the element in the first row, first column to a 17.

		gridNums[0][0] = 17;
		forGrid2Nums[0][0] = 17;
		
	//4. For both of those arrays, change the element in the second row, third column into a 20. 
		
		gridNums[2][3] = 20;
		forGrid2Nums[2][3] = 20;
		
	//5. For both of those arrays, change the last element in the first row to a -5. Accomplish this using .length 
		
		gridNums[0][gridNums[0].length-1] = -5;
		forGrid2Nums[0][forGrid2Nums[0].length-1] = -5;
		
	//6. For both of those arrays, change the first element in the last row to a -7. Accomplish this using .length 
		
		gridNums[3][gridNums[3].length-4] = -7;
		forGrid2Nums[2][forGrid2Nums[2].length-2] = -7;
		
	//7. For both of those arrays, change the last element in the last row to a -30. Accomplish this using .length 
		
		gridNums[3][gridNums[3].length-1] = -30;
		forGrid2Nums[2][forGrid2Nums[2].length-1] = -30;	
	
	//for questions 8-11
		
		printELementFirstRow(forGrid2Nums);
		printELementFirstColumn(forGrid2Nums);
		printELementRowMajor(forGrid2Nums);
		printELementColumnMajor(forGrid2Nums);
		
	}
	
	//8. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first row. 
		//this method will print each element in the first row
	
	public static int[][] printELementFirstRow(int[][] arr)
	{
		//this for loop will run as long as i is less than or equal to the length of the arr
		for(int i =0; i<=arr[0].length-1; i++)
		{
			//if the loop runs then this line of code will run
			System.out.println(arr[0][i]);
		}
		//this'll return the array
		return arr;
	}
	
	//9. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first column.
	
	public static int[][] printELementFirstColumn(int[][] arr)
	{
		//this for loop will run a long as i is less than the length of the array
		for(int i = 0; i<=arr.length-1; i++)
		{
			//if the loop runs then this line of code will run
			System.out.print(arr[i][1]);
		}
		
		//this'll return the array
		return arr;
	}
	
	//10. Create a method that is passed a 2-D array of ints and one by one prints out each element in row-major order. 
	
	public static int[][] printELementRowMajor(int[][] arr)
	{
		//this for loop will run a long as i is less than the length of the first rows length-1
		for(int i = 0; i<=arr[0].length-1; i++)
		{
			//this line of code will run after the for loop above runs
		   //this line of code will run as long as r is less than or equal to length-1
			for (int r = 0; r<=arr.length-1; r++)
			{ 
				//then this line will print the r and i
				System.out.println(arr[r][i]);
			}
		}
		
		//this'll return the array
		return arr;
	}
	
	//11. Create a method that is passed a 2-D array of ints and one by one prints out each element in column-major order. 

	public static int[][] printELementColumnMajor(int[][] arr)
	{
		//this for loop will run a long as i is less than the length of the first array -1
		for(int i = 0; i<=arr.length-1; i++)
		{
			//this line of code will run after the for loop above runs
		   //this line of code will run as long as r is less than the first row length-1
			for (int r = 0; r<arr[0].length-1; r++)
			{ 
				//then this line will print the i and r
				System.out.println(arr[i][r]);
			}
		}
		
		//this'll return the array
		return arr;

	}

}
	
