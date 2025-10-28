package operation;

public class Matrix {

	public static void main(String[] args) {
		int[][] matA = {
				{1, 2, 0},
				{4, 3, -1}
		};
		
		int[][] matB = {
				{5, 2, 3},
				{1, 3, 4}
		};
		
		addMatrice(matA, matB);
		System.out.println();
		subMatrice(matA, matB);
		System.out.println();
		mulMatrice(matA, 2);
	}
	
	/// Add 2 matrices together and return the result.
	private static int[][] addMatrice(int[][] a, int[][] b) {
		int[][] newMat = new int[2][3];
		
		for(int y = 0; y < 2; y++) {
			for(int x = 0; x < 3; x++) {
				newMat[y][x] = a[y][x] + b[y][x];
			}
			
			displayMatrice(a, y);
			displayMatrice(b, y);
			displayMatrice(newMat, y);
			System.out.println();
		}
		
		return newMat;
	}
	
	/// Substract 2 matrices and return the result.
	private static int[][] subMatrice(int[][] a, int[][] b) {
		int[][] newMat = new int[2][3];
		
		for(int y = 0; y < 2; y++) {
			for(int x = 0; x < 3; x++) {
				newMat[y][x] = a[y][x] - b[y][x];
			}
			
			displayMatrice(a, y);
			displayMatrice(b, y);
			displayMatrice(newMat, y);
			System.out.println();
		}
		
		return newMat;
	}
	
	/// Multiply a matrice by a multiplier and return the result.
	private static int[][] mulMatrice(int[][] mat, int mul) {
		for(int y = 0; y < 2; y++) {
			displayMatrice(mat, y);
			
			for(int x = 0; x < 3; x++) {
				mat[y][x] *= mul;
			}
			
			displayMatrice(mat, y);
			System.out.println();
		}
		
		return mat;
	}
	
	/// Display a row of a matrice.
	private static void displayMatrice(int[][] mat, int y) {
		System.out.print("| ");
		for(int x = 0; x < 3; x++) {
			System.out.print(mat[y][x]);
			System.out.print(" ");
		}
		System.out.print("|");
	}
}
