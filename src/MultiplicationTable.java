import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int number, sum = 1;
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("take any positive number : ");
		number = inputScanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			sum = number * i;
			System.out.println(number + "*" + i + "=" + number * i);
		}
		System.out.println("the result is : " + sum);
	}

}
