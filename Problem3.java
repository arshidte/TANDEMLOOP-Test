import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(num%2==0) {
			num-=1;
		}
		
		int j=1;
		for(int i=1;i<=num;i++) {
			System.out.print(j + " ");
			j+=2;
		}
	}
}
