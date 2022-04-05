import java.util.Scanner;

public class Problem4 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter the size");
	
	int size = sc.nextInt();
	
	
	System.out.println("Enter the numbers");
	
	int[] arr = new int[size];
	
	
	for(int i=0;i<size;i++) {
		
		arr[i] = sc.nextInt();
		
	}
	
	
	for(int i=1;i<=9;i++) {
		
		int count = 0;
		
		for(int j=0;j<size;j++) {
			
			if(arr[j]%i==0) {
				
				count++;
				
			}
			
		}	
		
		
		if(i==1) System.out.print("{");
		
			System.out.print(i + " : " + count);
			
			if(i!=9) {
				
				System.out.print(", ");
				
			}else {
				
				System.out.print("}");
				
			}
	}
 }
}