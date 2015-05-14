import java.util.Scanner;


public class SortArraysOfNumbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] numbers = scanner.nextLine().split(" ");
		int[] num = new int[numbers.length];
		
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(numbers[i]);
		}
		
		for(int i = 0; i < num.length - 1; i++) {
			for(int j = i + 1; j < num.length; j++) {
				if(num[i] > num[j]){
					int a = num[i];
					num[i] = num[j];
					num[j] = a;
				}
			}
		}
		
		for(int number:num) {
			System.out.print(number + " ");
		}
	}

}
