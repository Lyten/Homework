import java.util.Scanner;


public class SymmetricNumInRange {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		
		for (int i = start; i <= end; i++) {
			char[] digit = Integer.toString(i).toCharArray();
			
			if (digit.length == 1) {
				System.out.print(i + " ");
			}
			
			if (digit.length == 2 && digit[0] == digit[1]) {
				System.out.print(i + " ");
			}
			
			if (digit.length == 3 && digit[0] == digit[2]) {
				System.out.print(i + " ");
			}
		}
	}

}
