package by.company.kaliaha.task1.array.functionality;

import by.company.kaliaha.task1.array.Array;

public class Sorter{
	public Sorter() {}
	
	public <Type> boolean selectionSort(Array<Type> array) {
		boolean isSorted = false;
		if(!isNull(array)) {
	        for (int left = 0; left < array.length(); ++left) {
	        	int minIndex = findMinIndex(array, left);
	        	swap(array, left, minIndex);
	        }
	        isSorted = true;
		}
        return isSorted;
	}
	
	private boolean isNull(Object item) {
		return item == null;
	}
	
	private <Type> int findMinIndex(Array<Type> array, int left) {
		int minIndex = left;
    	for (int start = left; start < array.length(); ++start) {
    		Number current = (Number)array.get(start);
    		Number min = (Number)array.get(minIndex);
    		if (current.doubleValue() < min.doubleValue()) {
    			minIndex = start;
    		}
    	}
    	return minIndex;
	}

	private <Type> void swap(Array<Type> array, int maxIndex, int minIndex) {
		Type tmp = array.get(maxIndex);
	    array.set(maxIndex, array.get(minIndex));
	    array.set(minIndex, tmp);
	}

	public <Type> boolean bubbleSort(Array<Type> array) {
		boolean isSorted = false;
		if(!isNull(array)) {
			boolean needIteration = true;
			while (needIteration) {
				needIteration = doIteration(array);
			}
			isSorted = true;
		}
		return isSorted;
	}
	
	private <Type> boolean doIteration(Array<Type> array) {
		boolean needIteration = false;
		for (int index = 1; index < array.length(); ++index) {
			Number current = (Number)array.get(index);
			Number preCurrent = (Number)array.get(index - 1);
			if (current.doubleValue() < preCurrent.doubleValue()) {
				swap(array, index, index - 1);
				needIteration = true;
			}
		}
		return needIteration;
	}
	
	public <Type> boolean insertionSort(Array<Type> array) {
		boolean isSorted = false;
		if(!isNull(array)) {
			for (int current = 1; current < array.length(); ++current) {
				doInsertion(array, current);
			}
			isSorted = true;
		}
		return isSorted;
	}
	
	private <Type> void doInsertion(Array<Type> array, int indexCurrent) {
		for (; indexCurrent > 0; --indexCurrent) {
			int indexPreCurrent = indexCurrent - 1 ;
			Number currentValue = (Number)array.get(indexCurrent);
			Number preCurrentValue = (Number) array.get(indexPreCurrent);
			if (currentValue.doubleValue() < preCurrentValue.doubleValue()) {
				swap(array, indexCurrent, indexPreCurrent);
			} else {
				break;
			}
		}
	}
}