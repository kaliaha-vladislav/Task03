package by.company.kaliaha.task1.array.functionality;

import by.company.kaliaha.task1.array.Array;

public class SearchEngine{
	public SearchEngine() {}
	
	public int binarySearch(Array<?> array,  Number key) {
		if(isNull(array) || isNull(key)) {
			return -1;
		}
		
		int low = 0;
	    int high = array.length() - 1;    
	    
	    while(low <= high) {
	    	int middle = low + (high - low) / 2;
	    	
	    	Number middleItem = (Number)array.get(middle);
	    	
	    	if(key.doubleValue() < middleItem.doubleValue()) {
	    		high = middle - 1;
	    	} else if (key.doubleValue() > middleItem.doubleValue()) {
	    		low = middle + 1;
	    	} else {
	    		return middle;
	    	}
	    }
	    return -1;
	}
	
	private boolean isNull(Object object) {
		return object == null;
	}
	
	public int binarySearch(Array<?> array,  Number key, int low, int high) {	
		if(isNull(array) || isNull(key) || low > high) {
			return -1;
		}
		
		int middle = low + (high - low) / 2;
		Number doubleItem = (Number)array.get(middle);

		if(key.doubleValue() == doubleItem.doubleValue()) {
			return middle;	
		} else if(key.doubleValue() < doubleItem.doubleValue()) {
			return binarySearch(array, key, low, middle - 1);
		} else {
			return binarySearch(array, key, middle + 1, high);
		}
	}
}