import java.util.Scanner;


public class CountSubstringOccurrences {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine().toLowerCase();
		String subString = sc.nextLine().toLowerCase();
		
		int count = 0;
		for(int i = 0; i <= text.length() - subString.length();i++){
			if (text.substring(i, subString.length()+ i).equals(subString)){
				count++;
			}
		}
		System.out.print(count);
	}

}
