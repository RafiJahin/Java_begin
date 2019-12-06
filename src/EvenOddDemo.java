import java.util.Scanner;

public class EvenOddDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num;
		System.out.println("enter a number : ");
		Scanner type = new Scanner(System.in);
		num = type.nextFloat();

		if (num % 2 == 0) {
			System.out.println("the number is even");
		} else {
			System.out.println("the number is odd");
		}
	}

}
