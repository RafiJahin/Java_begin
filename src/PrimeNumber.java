import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int count = 0 ; 
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("take any positive integer : ");
		int num= inputScanner.nextInt();
		for (int i = 2; i < num; i++) {
			if (num%i==0) {
				count++;
				break;
			}
			
		}
		if (count==0) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime number");
		}

	}

}
