
public class Parking {

	private char Cars[];

	public Parking(char[] cars) {
		super();
		Cars = cars;
	}
	
	public void park(char car, int slot) {
		try {
			Cars[slot] = car;
	    } catch (IllegalStateException e) {
	        System.err.println("the slot" + slot + " is full");
	        System.exit(1);
	    }
	}
	
	public char unpark(int slot) {
		try {
			char car = Cars[slot];
			return car;
	    } catch (IllegalStateException e) {
	        System.err.println("the slot" + slot + " is empty");
	        System.exit(1);
	    }
		return 0 ;
	}
	
	public String toString() {
		
		for (int i = 0; i < Cars.length; i++) {
			char c = Cars[i];
			System.out.println(i + c);
		}
		
		return null;
	}

}
