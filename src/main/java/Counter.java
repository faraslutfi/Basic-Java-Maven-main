

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void resets() {
		count = 0;
	}
	
	public void incremen() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		return count;
	}
	
}
