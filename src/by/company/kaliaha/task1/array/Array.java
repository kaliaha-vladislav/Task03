package by.company.kaliaha.task1.array;

import java.io.Serializable;
import java.util.Iterator;

@SuppressWarnings("hiding")
public abstract class Array<Number> implements Serializable, Iterable<Number>{
	private static final long serialVersionUID = 1L;
	
	public abstract int length();
	
	public abstract boolean set(int index, Number item);
	public abstract Number get(int index);
	public abstract boolean remove(Number item);
	
	public abstract int indexOf(Number item);
	public abstract int lastIndexOf(Number item);
	
	public abstract boolean contains(Number number);
	
	public abstract void clear();	
	public abstract boolean isEmpty();
	
	public abstract void selectionSort();
	public abstract void bubbleSort();
	public abstract void insertionSort();
	
	public abstract int binarySearch(Number key);
	
	@Override
	public abstract String toString();	
	@Override
	public abstract boolean equals(Object obj);	
	@Override
	public abstract int hashCode();
	
	@Override
	public abstract Iterator<Number> iterator();
}