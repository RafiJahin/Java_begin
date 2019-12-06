import java.util.Scanner;

public class SimpleCalc {

	public static void main(String[] args) {
		int num1, num2, result;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the first number : ");
		num1 = input.nextInt();
		System.out.println("enter the second number : ");
		num2 = input.nextInt();
		result = num1 + num2;
		System.out.println("the sum is : " + result);
	}

}
