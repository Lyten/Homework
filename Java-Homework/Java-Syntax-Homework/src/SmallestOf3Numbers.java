import java.util.Scanner;

public class SmallestOf3Numbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		
		System.out.println(Math.min(Math.min(a, b), c));
	}
}
