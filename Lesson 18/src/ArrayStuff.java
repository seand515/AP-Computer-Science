
public class ArrayStuff {
	double sum = 0;

	public ArrayStuff() {
	}

	public double addemUp(double[] a) {
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;

	}

	public double highest(double[] a) {
		int high = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > a[high]) {
				high = i;
			}
		}
		return a[high];

	}

	public double lowest(double[] a) {
		int low = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[low]) {
				low = i;
			}
		}
		return a[low];
	}

	public String[] append(String[] a, String str) {
		String[] newa = new String[a.length + 1];
		newa[newa.length - 1] = str;
		return newa;
	}

	public double[] append(double[] a, double num) {
		double[] newa = new double[a.length + 1];
		newa[newa.length - 1] = num;
		return newa;
	}

	public int indexOf(String[] a, String str) {
		int indexOf = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == str) {
				indexOf = i;
			} else {
				indexOf = -1;
			}

		}
		return indexOf;

	}

	public int indexOf(double[] a, double num) {
		int indexOf = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				indexOf = i;
			} else {
				indexOf = -1;
			}
		}
		return indexOf;
	}

	public int multsOf(double[] a, double num) {
		int times = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % num == 0) {
				times++;
			}
		}
		return times;
	}

	public double[] deleteThree(double[] a) {
		int numThree = 0;
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 3 == 0) {
				numThree++;

			}

		}
		double[] withoutThree = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 3 != 0) {
				withoutThree[counter] = a[i];
				counter++;

			}
			
		}
		return withoutThree;
	}
	public double totalLength(String[]a){
		int totalLength = 0;
		for (int i  = 0; i<a.length;i++){
			totalLength += a[i].length();			
		}
		return totalLength;
	}
	public double lengthCompare(String[]a, String[]b){
		double difference = 0;
		int sumA = 0;
		int sumB = 0;
		for (int i = 0; i<a.length;i++){
			sumA += a[i].length();
		}
		for (int i = 0; i<b.length;i++){
			sumB += b[i].length();
		}
		if(sumA > sumB){
			difference  = sumA - sumB;
		}else{
			difference = sumB - sumA;
		}
		return difference;
	}
	public double[] sumArray(double[]a, double[]b){
		if(a.length == b.length){
			for (int i = 0; i<a.length;i++){
				
			}
		}
		
		
	}

}
