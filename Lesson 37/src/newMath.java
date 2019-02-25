
public class newMath implements interMath {

	public static void main(String[] args) {

	}

	public double mod(double x, double y) {
		int divAns = 0;
		for (int i = 0; i <= x; i++) {
			if (y * i == x) {
				return 0;
			} else if (y * i > x) {
				divAns = i - 1;
				break;
			}

		}

		return 0;
	}

	public double pow(double x, int y) {
		double ans = 1;
		for (int i = 0; i < y; i++) {
			ans = x * ans;
		}
		return ans;
	}

	public double[] quadratic(double a, double b, double c) {
		double[] answer = new double[2];
		double ans1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		double ans2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		answer[0] = ans1;
		answer[1] = ans2;
		return answer;

	}

	@Override
	public double pythag(double a, double b) {

		return Math.sqrt(pow(a, 2) + pow(b, 2));
	}

	@Override
	public double factorial(double a) {
		double ans = a;
		for (double i = a - 1; i > 0; i--) {
			ans = ans * i;
		}
		return ans;
	}

	public double circleArea(double radius) {
		return Math.PI * Math.pow(radius, 2);

	}

	public double slope(double x1, double x2, double y1, double y2) {
		return (y2 - y1) / (x2 - x1);
	}

}
