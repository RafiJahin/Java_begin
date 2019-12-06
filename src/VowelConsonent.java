import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch;
		System.out.println("print any letter you want : ");
		ch = input.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("the letter is a vowel");
		} else {
			System.out.println("thats a consonent man");
		}
	}

}
