
public class ArithProgression {
	

	    /** Current value of the progression.  */
	    public long cur;
	    public long nextVal;

	 
	    public ArithProgression(int first, int difference) {
		     cur = first;
		     nextVal = difference;
	    }

	    private long firstValue() {
		    return cur;
	    }

	    private long nextValue() {
	    	cur += nextVal;
		    return cur; // default next value
	    }

	    /** Prints the first n values of the progression.
	     *
	     * @param n number of values to print
	     */
	     public void printProgression(int n) {
		      System.out.print(firstValue());
	        for (int i = 2; i <= n; i++) {
	          System.out.print(" " + nextValue());
	        }
		      System.out.println(); // ends the line
	     }
	    

}


