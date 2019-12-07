import java.util.Scanner;

public class Series3 {

	public static void main(String[] args) {
		double n, sum = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the last number : ");
		n = input.nextDouble();
		for (double i = 1; i <= n; i++) {
			sum = sum * i * i;
			System.out.print(" " + i);
		}
		System.out.println("");
		System.out.println("the summation of the series is : " + sum);

	}

}
