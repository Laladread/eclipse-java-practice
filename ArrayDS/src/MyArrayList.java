import java.util.Arrays;

public class MyArrayList {
	private Object[] data; //hidden array for ArrayList
	private int count = 0;
	private int FIXED_SIZE = 10;
	
	public MyArrayList() {
		data = new Object[this.FIXED_SIZE];
	}
	
	public MyArrayList(int c) {
		data = new Object[c];
	}
	
	
	/**
	 * Get the specific object
	 * @param index
	 * @return
	 */
	public Object get(int index) {
		if (index < count) {
			return data[index];
		
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	
	/**
	 * Add new object to the array list
	 * @param obj
	 */
	public void add(Object obj) {
		if(data.length - count < 1) {
			this.reSizeArray();
		}
		data[count++] = obj;
	}
	
	/**
	 * Remove the object from list
	 * @param index
	 * @return
	 */
	public Object remove(int index) {
		if(index < count) {
			
			//step 1: remove the element with the given index
			Object obj = data[index];
			int temp = index;
			data[index] = null;
			
			//step 2: left moving of elements after the index
			while(temp < count) {
				data[temp] = data[temp + 1];
				data[temp +1] = null;
				temp++;
			}
			count--;
			return obj;
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	/**
	 * Resizing the Array
	 */
	public void reSizeArray() {
		data = Arrays.copyOf(data, data.length * 2);
	}
	public int size() {
		return count;
	}
/**
 * Test the ArrayList
 * @author Teacher
 */
public static class test{
	
	public static void main(String[] args) {
		//initialize the an instance of MyArrayList
		MyArrayList mal = new MyArrayList(20);
		
		//add new elements
		mal.add(new Integer(2));
		mal.add(new Integer(5));
		mal.add(new Integer(1));
		mal.add(new Integer(23));
		mal.add(new Integer(14));
		
		//display the elements in the list
		for(int i = 0; i < mal.size(); i++) {
			System.out.println(mal.get(i) + "");
		}
		
		//add a new value
		mal.add(new Integer(29));
		System.out.println("Element at position 5:" + mal.get(5));
		System.out.println("Total List size: " + mal.size());
		System.out.println("Removing element at position 2: " + mal.remove(2));
		for(int i = 0; i < mal.size(); i++) {
			System.out.println(mal.get(i) + "");
		}
		

	}
 }

}
