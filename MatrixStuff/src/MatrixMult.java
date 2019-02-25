
public class MatrixMult {

	public static void main(String[] args) {
		int[][] a = { { 6, 2, 0 }, { 7, 6, 3 }, { 4, 2, 0, } };
		int[][] b = { { 0, 2, 7, 8, 10 }, { 1, 6, 7, 6, 39 }, { 1, 4, 7, 4, 6 } };
		mult(a, b);
	}

	public static int[][] mult(int[][] a, int[][] b) {
		if (a.length != b[0].length && b.length != a[0].length) {
			return null;

		}
		int[][] newArray = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int x = 0; x < b[0].length; x++) {
				for (int y = 0; y < b.length; y++) {
					newArray[i][x] += a[i][y] * b[y][x];
				}

			}

		}
		for (int x = 0; x < newArray.length; x++) {
			for (int y = 0; y < newArray[0].length; y++) {
				System.out.println(newArray[x][y] + " ");
			}
			System.out.println();
		}
		return newArray;
	}

}
