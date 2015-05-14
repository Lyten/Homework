import java.util.Scanner;


public class AngleUnitConverter {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double[] num = new double[n];
		String[] type = new String[n];
		
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextDouble();
			type[i] = scanner.next();
		}
		
		for (int j = 0; j < n; j++) {
			convert(num[j], type[j]);
		}
	}

	private static void convert(double num, String type) {
		if (type.equals("rad")) {
			double result = Math.toDegrees(num);
			System.out.printf("%.6f deg\n", result);
		}
		else {
			double result = Math.toRadians(num);
			Math.toDegrees(num);
			System.out.printf("%.6f rad\n", result);
		}
	}

}
