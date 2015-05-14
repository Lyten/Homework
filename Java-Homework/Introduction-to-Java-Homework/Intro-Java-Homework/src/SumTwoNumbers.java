import java.util.Scanner;

public class SumTwoNumbers {
	public static void main(String []args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        int numA = input.nextInt();
        int numB = input.nextInt();
        int sum = numA + numB;
        System.out.println("" + sum);
    }
}