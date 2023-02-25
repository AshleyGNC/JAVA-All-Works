public class extArithProgression extends Progression{
	private long inc;
	
	public extArithProgression() {
		first = 0;
		inc = 1;
	}
	public extArithProgression(int f, int i) {
		first = f;
		inc = i;
	}
	protected long nextValue() {
		cur = cur + inc;
		return cur;
	}
}

/*
 * public class extFibProgression extends Progression{
 * private long prev;
 *
 * 
 * public extFibProgression(){   //default constructor
 * first = 1;
 * prev = 0;
 * }
 * 
 * public extFibProgression(int f, int s){
 * frist = f;
 * prev = s- f;
 * }
 * 
 *protected long nextValue() {
 *		long tmp = cur;
		cur = cur + prev;
		prev = tmp;
		return cur;
	}
	
	
	
	
	public class A {
		public int val = 1;
	}
	public class B extends A{
		public int value = 2;
	}
	
	teste{
	B obj1 = new B()
	sysout(obj1.val)
	A obj2 = new B()
	sysout(objc2.val)
	
	//result 
	 * 2
	 * 1
	 * 
	 * It returns the data based on the actual data type
	 * If we can't find the definition of that method in the subclass, we jump back to the super class, will be as running just in the supper class.
	 * Can't go from the supper to the subclass
	 * 
	 * 
	 * But you can overwrite the method in the subclass and get the value you want for each independently.
	 * 
	 * 
	 * 
	 * ******************MyLocation, lab pt2******************
	 * pulic class myLocation{
	 * 		private String name;
	 * 		private double lat;
	 * 		private double lon;
	 * 
	 * public myLocation(String n, double la, double lo){
	 * 		name = n;
	 * 		lat = la;
	 * 		lon = lo;
	 * }
	 * 
	 * public String toString(){
	 * 		String rt = name + ":" + lat + "," lon;
	 * }
	 * 
	 * 
 */




/*
public class extArithProgression extends ArithProgression{
	public extArithProgression(int first, int difference) {
		super(first, difference);
		// TODO Auto-generated constructor stub
		
	}
	public extArithProgression() {
		super(0, 1);
	}
	
	
		

}
*/