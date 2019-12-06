import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		double celsius, fahrenheit;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the value of temperature in fahrenheit : ");
		fahrenheit = input.nextDouble();
		celsius = (5 * (fahrenheit - 32)) / 9;
		System.out.println("the value of fahrenheit in celsius scale is :  " + celsius);

	}

}
