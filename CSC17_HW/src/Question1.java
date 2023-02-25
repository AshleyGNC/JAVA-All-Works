import java.util.Scanner;

public class Question1 {
	

	public static void main(String[] args) {
		Question1 equation = new Question1();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a double number: ");		
		double n = in.nextDouble();
		
		System.out.print("Enter another double number: ");		
		double n2 = in.nextDouble();
		
		System.out.println("The square root of the sum is: " + equation.getSqrt(n, n2));
		in.close();
	}
	
	//Method calculates & returns the square root of the sum
	private double getSqrt(double val1, double val2) {
		return Math.sqrt(val1 + val2);
	}
}
