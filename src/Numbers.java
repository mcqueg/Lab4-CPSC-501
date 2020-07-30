import java.util.Arrays;

//********************************************************************
//Garrett McCue 	
//
//7/30/20
//
//CPSC-501-Lab4Ex4
//**********************************************************************


public class Numbers {
	// initialize the array and its length to variables
	static int nums[] = {78, 22, 56, 99, 12, 14, 17, 15, 1, 144, 37, 23, 47, 88, 3, 19};
	static int n = nums.length;
	
	//-------------------------------------------------------------------
	//  calls nextLargest to find the next greatest element in an 
	//  array for each individual element
	//-------------------------------------------------------------------
	
	public static void main(String[] args) {
		nextLargest(nums);
	}

	private static void nextLargest(int array[]) {
		// loop through the array one element at a time
		for (int i = 0; i < n; i++) {
			int next = Integer.MAX_VALUE;
			
			// second iteration of loops to compare every value 
			for (int x = 0; x < n; x++) {
				
				// assigns next to the next greatest value in the array
				// for position array[i]. Updates next if a value is smaller
				// than the current next value but still larger than array[i].
				// If there is no greater value in the array next will be MAX_VALUE. 
				if (array[x] > array[i] && array[x] < next) {
					next = array[x];

				}
			}
			System.out.println(array[i] + ": " + next);
		}

	}
}