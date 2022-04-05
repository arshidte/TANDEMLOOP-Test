import java.util.Scanner;

public class problem2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int j = 1;
		for(int i=0;i<num;i++) {
				System.out.print(j + " ");
				j+=2;
		}
	}
}
