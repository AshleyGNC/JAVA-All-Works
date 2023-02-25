import java.util.Scanner;

public class Question2 {
		
	public static void main(String[] args) {
		boolean stay = true;
		while (stay) {				//Loop/Keep asking until user quits.
			System.out.println(
					"1. Convert millimeters to feet.\r\n"
					+ "2. Convert meters to inches.\r\n"
					+ "3. Convert kilometers to yards.\r\n"
					+ "4. Quit\r\n");
			
			Question2 choice = new Question2();
			Scanner in = new Scanner(System.in);
			System.out.print("Enter choice: ");		
			int n = in.nextInt();
			
			Scanner inNum = new Scanner(System.in);
			
			if (n < 4) {			//If user doesn't quit ask for a value
				System.out.print("Enter number to convert: ");
				int number = inNum.nextInt();
				
				if (n == 1) {
					System.out.println("The result is " + choice.mmTOft(number) + "\n"); 
				}
				if (n == 2) {	
					
					System.out.println("The result is " + choice.mTOin(number) + "\n");
				}
				if (n == 3) {		
					System.out.println("The result is " + choice.kmTOyd(number) + "\n");
				}
			}
			
			if (n == 4) {         //Stop asking/loop when user enters 4 (Quit)
				in.close();
				inNum.close();
				stay = false;
			}
		}
	}
	
	//Methods to convert the inputed value
	private double mmTOft(double n) {
		return (n/304.8);
	}
	
	private double mTOin(double n) {
		return (n*39.37);
	}
	
	private double kmTOyd(double n) {
		return (n*1094);
	}

}
