
public class fib {
	public static void main(String[] args) {
		fib myobject = new fib();
		System.out.print(myobject.fib1(20));
	}
	
	public void fibseq(int n) {
		for (int i=1; i<= n; i++) {
			System.out.print(fib1(i) + " ");
		}
	}
	private int fib1(int n) {
		if(n < 0) {
			System.out.println("n should be positive");
			return -1;
		}else if(n <= 2) {
			return n;
		}else {
			int a=1;
			int b=2;
			int c = -1;
			for (int i=3; i<=n; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			return c;
		}
	}

}
