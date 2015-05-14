import java.util.Scanner;

public class DecimalToHex {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int numDec = input.nextInt();
		String numHex = Integer.toHexString(numDec).toUpperCase();
		System.out.println(numHex);
	}
}
