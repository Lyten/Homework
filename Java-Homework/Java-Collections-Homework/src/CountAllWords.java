import java.util.Scanner;

public class CountAllWords {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String[] textL = text.split("\\W+");
		System.out.println(textL.length);
	}
}
