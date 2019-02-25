
public class MultiD {

	public static void main(String[] args) {

	}

	public static void print1D(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i] + " ");
		}
	}

	public static void print2D(int[][] x) {
		for (int r = 0; r < x.length; r++) {
			for (int c = 0; c < x[0].length; c++) {
				System.out.println(x[r][c]);
			}

		}
	}

	public static int[][] compileArrays(int[] x, int[] y, int[] z) {
		int[][] newArray = new int[3][];
		newArray[0] = x;
		newArray[1] = y;
		newArray[2] = z;
		return newArray;

	}

	public static String[][] evenArray(String[][] words) {
		int low = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length <= words[low].length) {
				low = words[i].length;
			}
		}
		String[][] newArray = new String[words.length][low];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = words[i];
		}
		return newArray;

	}

	public static boolean StringLength(int[] lens, String[][] words) {
		for(int i = 0; i<lens.length; i++);

	}

}
