import java.util.Scanner;


public class CountSpecifiedWord {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toUpperCase();
		String[] text = input.split("\\W+");
		String word = sc.nextLine().toUpperCase();
		
		int count = 0;
		for(int i = 0; i <text.length;i++) {
			if(word.equals(text[i])) {
				count++;
			}
		}
		System.out.print(count);
	}

}
