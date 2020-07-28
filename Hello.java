import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		int x;
		Scanner  input = new Scanner(System.in);
		x = input.nextInt();
		System.out.println("Enter an Integer number:");
		if (x%2==0) {
			System.out.println("Entered number is even");
		}
		else
				System.out.println("Entered number is odd");	
			
		}
	}
