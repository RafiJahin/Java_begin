import java.util.Scanner;


public class Area {

	public static void main(String[] args) {
		double base, height, result;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Value of The base : ");
		base = input.nextDouble();
		System.out.println("enter the value of the height : ");
		height = input.nextDouble();
		result = 0.5 * height * base;
		System.out.println("the area of the triangle is :" + result);
	}

}
