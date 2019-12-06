import java.util.Scanner;

public class Increment {

	public static void main(String[] args) {
		int x, y;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Value of x : ");
		x = input.nextInt();
		y = x++;
		System.out.println("the value of y = " + y);
		y = x;
		System.out.println("the value of y = " + y);
	}

}
