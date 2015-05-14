import java.util.Scanner;


public class LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String[] arrStr = scanner.nextLine().split(" ");
		
		int counter = 1;
		int maxCount = 1;
		int index = 0;
		for(int i= 1; i < arrStr.length;i++) {
			if(arrStr[i].equals(arrStr[i-1])) {
				counter++;
			}else{
				counter = 1;
			}
			
			if(counter > maxCount){
				maxCount = counter;
				index = i;
			}
		}
		for(int j =0; j < maxCount;j++) {
			System.out.print(arrStr[index] + " ");
		}
	}

}
