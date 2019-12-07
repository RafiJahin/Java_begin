import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		double n, sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the last number : ");
		n = input.nextDouble();
		for (double i = 1.5; i < n; i = i + 2) {
			sum = sum + i;
			System.out.println("the numbers are : " + " " + i);
		}
		System.out.println("the summation of the series is : " + sum);
	}

}
