
public class Altering_Arrays_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {1, 2, 3, 4};
		minusFive(nums);

	}
	
	public static int[] minusFive(int[]arr)
	{
		int[] copArr = new int [arr.length];
		
		for (int i = 0; i < copArr.length; i++)
		{
			System.out.println(copArr[i] = arr[i] - 5);
		}
		
		return copArr;
	}

	
}
