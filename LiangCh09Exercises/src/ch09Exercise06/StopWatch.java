package ch09Exercise06;

public class StopWatch {
	
	private long startTime; // Start time
	private long endTime;	// End time
	
	public StopWatch () {
		startTime = System.currentTimeMillis();
	}

	public void start() {
		startTime = System.currentTimeMillis();
		
	}

	public void stop() {
		endTime = System.currentTimeMillis();
		
	}

	public long getElapsedTime() {
		return getEndTime() - getStratTime();
	}

	private long getStratTime() {
		return this.startTime;
	}

	private long getEndTime() {
		// TODO Auto-generated method stub
		return this.endTime;
	}

}
