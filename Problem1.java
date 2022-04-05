import java.util.Scanner;

public class Problem1 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		double a = sc.nextDouble();
		
		System.out.println("Enter the second number");
		double b = sc.nextDouble();
		
		System.out.println("Select the operation");
		System.out.println("1 for Addition");
		System.out.println("2 for Subtraction");
		System.out.println("3 for Multiplication");
		System.out.println("4 for Division");
		
		String opr = sc.next();
		
		Operations operate = new Operations();
		
		switch (opr) {
		case "1":
			operate.addition(a, b);
			break;
		case "2":
			operate.subtraction(a, b);
			break;
		case "3":
			operate.multiplication(a, b);
			break;
		case "4":
			operate.division(a, b);
			break;
		default:
			System.out.println("Select proper operation");
		}
	}
}

class Operations {
	
	void addition(double a,double b) {
		System.out.println("The answer is " + (a + b));
	}
	
	void subtraction(double a, double b) {
		System.out.println("The answer is " + (a - b));
	}
	void multiplication(double a,double b) {
		System.out.println("The answer is " + (a * b));
	}
	
	void division(double a, double b) {
		System.out.println("The answer is " + (a / b));
	}
	
}
