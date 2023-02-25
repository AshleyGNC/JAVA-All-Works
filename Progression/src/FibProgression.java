public class FibProgression {
	
	private long firstNum;
	private long secondNum;
	private long next;
	private long prev;
	
	public FibProgression(int k, int n){
		firstNum = k;
		secondNum = n - k;
	}
	
	private long firstValue() {
		next = firstNum;
		prev = secondNum;
	    return firstNum;
    }
	
	
	private long nextValue() {
		long tmp = next;
		next = next + prev;
		prev = tmp;
		return next;

}
	


	public void printProgression(int n) {
	      System.out.print(firstValue());
      for (long i = 2; i <= n; i++) {
        System.out.print(" " + nextValue());
      }
	    System.out.println(); // ends the line
   }
}
/*
 *  changing printProgression() (##mine)
 * private long firstValue() {
		//next = firstNum;
	    return firstNum;
    }
	private long secondValue() {
		//next = firstNum;
	    return secondNum;
    }
	
	private long nextValue() {
		next = firstNum + secondNum;
		firstNum = secondNum;
		secondNum = next;
		return next;
}
	


	public void printProgression(int n) {
	      System.out.print(firstValue());
	      System.out.print(" " + secondValue());
      for (long i = 2; i <= n-1; i++) {
        System.out.print(" " + nextValue());
      }
	    System.out.println(); // ends the line
   }
 */
