package array;
public class TwoDArrayDemo {

	public static void main(String[] args) {
		/**
		 * 2D Array
		 * It is an array of an arrays
		 * Two types - Simple 2D array and Jagged 2D array
		 * Simple 2D array has same number of rows and columns
		 * Jagged 2D array has different number of rows and columns
		 */
		
		int a1[] = {2, 4, 6, 7};
		int a2[] = {9, 1, 5, 2};
		int a3[] = {5, 7, 2, 1, 22};
		
		int myArr[][] = {a1, a2, a3}; // Jagged 2D array- rows are 3 but columns are 4, 4, 5 for 1st, 2nd, 3rd row respectively.
		System.out.println(myArr); // Print object's Hashcode
		
		/**
		 * Iterating using for loop
		 */
		System.out.println("---------for loop-------------");
		for(int i = 0; i < myArr.length; i++) {
			for(int j = 0; j < myArr[i].length; j++) { // myArr[i].length instead of myArr.length to calculate different column as per rows
				System.out.println(myArr[i][j]);
			}
		}
		
		/**
		 * Iterating using enhanced for loop
		 */
		System.out.println("---------enhanced for loop-------------");
		for(int ma[]: myArr) {
			for(int m: ma) {
				System.out.println(m);
			}
		}
		
	}

}
