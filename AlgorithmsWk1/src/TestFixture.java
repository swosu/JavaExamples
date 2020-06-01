
public class TestFixture {
	
	private int arraySize;

	public void setArraySize(int arraySize) {
		this.arraySize= arraySize;
		
	}

	public int getArraySize() {
		return this.arraySize;
	}

	public void fillArray(int[] startingArray) {
		for(int index = 0; index < startingArray.length; index++)
		{
			startingArray[index] = (int)(Math.random()*2000);
		}
	}

}
