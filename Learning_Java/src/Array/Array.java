package Array;

public class Array {
	private long[] arr;
	
	private int len;
	
	public Array() {
		arr = new long[50];
	}
	
	
	public Array(int maxsize) {
		arr = new long[maxsize];
	}
	
	public void insert(long value) {
		arr[len] = value;
		len ++;
	}
	
	public void display() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public int search(long value) { // find a particular value, return index
		int i;
		for(i = 0; i < arr.length; i++) {
			if(value == arr[i]) {
				break;
			} 
		}
		
		if (i == len) {
			return -1;
		} else {
			return i;
		}
	}
	
	
	public long get(int index) {
		if(index >= len || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			return arr[index];
		}
	}
	
	
	public void delete(int index) {
		if(index >= len || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			for(int i = index; i < len; i++) {
				arr[index] = arr[index + 1];
			}
			len --;
		}
	}
	
	public void update(int index, long newValue) {
		if(index >= len || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			arr[index] = newValue;
		}
	}
	
	
	
	
}
