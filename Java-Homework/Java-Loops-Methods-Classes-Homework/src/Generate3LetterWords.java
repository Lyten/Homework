import java.util.Scanner;


public class Generate3LetterWords {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		char[] chars = scanner.next().toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			String fChar = Character.toString(chars[i]);
			for (int j = 0; j < chars.length; j++) {
				String sChar = Character.toString(chars[j]);
				for (int k = 0; k < chars.length; k++) {
					String tChar = Character.toString(chars[k]);
					System.out.print(fChar + sChar + tChar + " ");
				}
			}
		}
	}
}
