import java.util.Scanner;

public class FormatNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		float b = input.nextFloat();
		float c = input.nextFloat();
		
		System.out.printf("|%-10X", a);
		System.out.printf(String.format("|%10s|", Integer.toBinaryString(a)).replace(" ", "0"));
		System.out.printf("%10.2f|", b);
		System.out.printf("%-10.3f|", c);
	}
}
