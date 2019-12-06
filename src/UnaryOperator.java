import java.util.Scanner;


public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10 , y;
		Scanner input = new Scanner(System.in);
System.out.println("enter the value of x : ");

y=x++ ; 
y= input.nextInt();
System.out.println("the value of y is : "+ y);
y= x;
System.out.println("the value of y is : "+ y);

	}

}
