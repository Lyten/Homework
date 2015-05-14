import java.util.Scanner;

public class CountOfBitsOne {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count = 0;
		String bit = Integer.toBinaryString(n);
		for (int i = 0; i < bit.length(); i++) {
			if (bit.charAt(i) == '1') {
				count++;
			}
		}
		System.out.println(count);
	}
}
