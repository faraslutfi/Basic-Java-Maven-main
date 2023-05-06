

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void resett() {
		count = 0;
	}
	
	public void increments() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		return count;
	}
	
}
