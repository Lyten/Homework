import java.util.Scanner;


public class LongestIncreasingSequence {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String[] split = scanner.nextLine().split(" ");
		int[] numbers = new int[split.length];
		
		for(int i = 0; i < split.length; i++) {
			numbers[i] = Integer.parseInt(split[i]);
		}
		
		int counter = 0;
		int sequence = 1;
		int indexN = 0;
		System.out.print(numbers[0] + " ");
		for(int i = 1; i < numbers.length; i++){
			if (numbers[i] >numbers[i-1]) {
				System.out.print(numbers[i] + " ");
				sequence++;
			}else {
				System.out.println();
				System.out.print(numbers[i]+ " ");
				sequence = 1;
			}
			if (sequence > counter) {
				counter = sequence;
				indexN = i;
			}
		}
		System.out.println();
		System.out.print("Longest: ");
		int index = (indexN - (counter -1));
		
		if(counter >1){
			for (int j = 0; j < counter; j++) {
				System.out.print(numbers[index] + " ");
				index++;
			}
		}else {
			System.out.println(numbers[0]);
		}
	}
}
