import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class ExtractAllUniqueWords {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine().toLowerCase();
		String[] textArr = text.split("\\W");
		Arrays.sort(textArr);
		
		Set<String> extractText = new TreeSet<String>();
		for(int i = 0; i < textArr.length;i++){
			extractText.add(textArr[i]);
		}
		extractText.stream().forEach(x -> System.out.print(x + " "));
	}

}