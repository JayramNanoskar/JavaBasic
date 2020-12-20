package array;
public class ThreeDArrayDemo {

	public static void main(String[] args) {
		/**
		 * 3D Array
		 * It is an array of 2D arrays.
		 */
		int a1[] = {2, 4, 6, 7}; // 1D array
		int a2[] = {9, 1, 5, 2};
		int a3[] = {5, 7, 2, 1, 22};
		
		int aa1[] = {-4, -5, 6, 9}; // 1D array
		int aa2[] = {1};
		int aa3[] = {2, 3};
		
		int myArr1[][] = {a1, a2, a3}; // Jagged 2D array
		int myArr2[][] = {aa1, aa2, aa3}; // Jagged 2D array
		
		int myArray[][][] = {myArr1, myArr2}; // 3D array
		System.out.println(myArray); // Print object's Hashcode
		
		/**
		 * Iterating using for loop
		 */
		System.out.println("--------for loop------------");
		for(int i = 0; i < myArray.length; i++) { // looping through 3D array
			for(int j = 0; j < myArray[i].length; j++) { // looping through 2D array
				for(int k = 0; k < myArray[i][j].length; k++) { // looping through 1D array
					System.out.println(myArray[i][j][k]);
				}
			}
		}
		
		/**
		 * Iterating using enhanced for loop
		 */
		System.out.println("--------enhanced for loop------------");
		for(int marr[][]: myArray) { // looping through 3D array
			for(int ma[]: marr) { // looping through 2D array
				for(int m: ma) { // looping through 1D array
					System.out.println(m);
				}
			}
		}
	}

}
