public class SquareRoot {
	public static void main(String[] args) {
		System.out.println(squareroot(100));
		System.out.println(power(4, 0.5));
	}

	private static double squareroot (double x) {
		return (Math.pow(x, 0.5));
	}

	private static double power(double base, double exponent) {
		double product=1.0;
		for(double i=exponent; i>0; i--) {
			product *= base;
		}
		return produt;
	}
}

