package by.company.kaliaha.task1.array;

import java.util.Arrays;
import java.util.Iterator;

import by.company.kaliaha.task1.array.functionality.Functional;
import by.company.kaliaha.task1.array.functionality.SearchEngine;
import by.company.kaliaha.task1.array.functionality.Sorter;

@SuppressWarnings("serial")
public class IntegerArray extends Array<Integer>{	
	private int[] array;
	private Functional functional;
	private Sorter sorter;
	private SearchEngine searchEngine;

	private IntegerArray() {
		array = new int[0];
		functional = new Functional();
		sorter = new Sorter();
		searchEngine = new SearchEngine();
	}
	
	public IntegerArray(int... array) {
		this();
		if(array != null) {
			this.array = new int[array.length];
			for(int index = 0; index < array.length; ++index) {
				this.array[index] = array[index];
			}
		}
	}
	
	public IntegerArray(int length) {
		this();
		if(length > 0) {
			array = new int[length];
		}
	}
	
	@Override
	public boolean set(int index, Integer item) {
		boolean isSet = false;		
		if(isInBounds(index) && item != null) {
			array[index] = item;
			isSet = true;
		}		
		return isSet;
	}
	
	private boolean isInBounds(int index) {
		return (index >= 0 && index < array.length) ? true : false;
	}
	
	@Override
	public Integer get(int index) {
		return (isInBounds(index)) ? array[index] : null;
	}
	
	@Override
	public int length() {
		return array.length;
	}
	
	@Override
	public int indexOf(Integer item) {
		return functional.indexOf(this, item);
	}
	
	@Override
	public int lastIndexOf(Integer item) {
		return functional.lastIndexOf(this, item);
	}
	
	@Override
	public void clear() {
		functional.clear(this);
	}
	
	@Override
	public boolean remove(Integer item) {
		return functional.remove(this, item);
	}
	
	@Override
	public boolean contains(Integer number) {
		return functional.contains(this, number);
	}
	
	@Override
	public void selectionSort() {	
		sorter.selectionSort(this);
	}
	
	@Override
	public void bubbleSort() {
		sorter.bubbleSort(this);
	}
	
	@Override
	public void insertionSort() {
		sorter.insertionSort(this);
	}
	
	@Override
	public int binarySearch(Integer key) {	
		return searchEngine.binarySearch(this, key);
	}

	@Override
	public boolean isEmpty() {
		return functional.isEmpty(this);
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(array);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass())return false;			
		IntegerArray other = (IntegerArray) obj;
		if (!Arrays.equals(array, other.array))
			return false;
		return true;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName());
		builder.append(" [");
		builder.append(putTogether());	
		builder.append("]");
		return builder.toString();
	}
	
	private String putTogether() {
		StringBuilder builder = new StringBuilder();
		int index = 0;
		for(Object item : array) {
			if(index != 0) {
				builder.append(", ");
			}
			builder.append(item);
			++index;
		}
		return builder.toString();
	}
	
	@Override
	public Iterator<Integer> iterator() {
		Iterator<Integer> iterator = new Iterator<Integer>() {
			private int currentIndex = 0;
			
			@Override
			public boolean hasNext() {
				return currentIndex < array.length;
			}

			@Override
			public Integer next() {
				return array[currentIndex++];
			}
			
			@Override
			public void remove() {
				throw new UnsupportedOperationException("remove");
			}
		};
		return iterator;
	}
}