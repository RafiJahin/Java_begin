import java.util.Scanner;

public class SumloopUserinput {

	public static void main(String[] args) {
		int sum = 0;
		int m, n;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the value of m : ");
		m = input.nextInt();
		System.out.println("enter the value of n : ");
		n = input.nextInt();

		for (int i = m; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("the sum of numbers m to n is : " + sum);
	}

}
