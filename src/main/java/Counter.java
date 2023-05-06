

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void resets() {
		count = 0;
	}
	
	public void incrementt() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		return count;
	}
	
}
