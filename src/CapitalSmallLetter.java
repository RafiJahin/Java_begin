import java.util.Scanner;

public class CapitalSmallLetter {

	public static void main(String[] args) {
		Scanner character = new Scanner(System.in);
		char ch;
		System.out.println("print any letter : ");
		ch = character.next().charAt(0);
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("thats a small letter .");

		} else {
			System.out.println("thats a capital letter .");
		}
	}

}
