import java.util.Scanner;

public class Question4 
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");		
		int number = in.nextInt();
		
		if (isPrime(number)) {				//test the number itself is prime
			System.out.println("The nearest lower prime number is itself: " + number);
			in.close();
		} else {
		
			for(int i=1; i<number; i++) {
				int n = number - i;       	//test smaller numbers
				if (isPrime(n)) {
					System.out.println("This is the nearest lower prime number: " + n);
					break;
				}
			}
			in.close();
		}
	}
	
	
	//Method to check if a number is prime
	public static boolean isPrime(int n){
		boolean prime = true;
		
		int i = 2;
		while(i <= n/2) { 				//going through numbers >3 to check if they are prime
			if(n%i == 0) { 			 	//checking if the number is divisible by two
				prime = false; 
				break;
			}
			i++;
		}
		return prime;
	}

}


