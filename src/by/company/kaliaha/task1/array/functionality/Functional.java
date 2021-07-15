package by.company.kaliaha.task1.array.functionality;

import by.company.kaliaha.task1.array.Array;

public class Functional{
	public Functional() {}
	
	public int indexOf(Array<?> array, Number item) {
		int indexItem = -1;
		if (!isNull(item) && !isNull(array)) {
			for(int index = 0; index < array.length(); ++index) {
				if(array.get(index) == item) {
					indexItem = index;
					break;
				}
			}
		}
		return indexItem;
	}
	
	private boolean isNull(Object item) {
		return item == null;
	}

	public int lastIndexOf(Array<?> array, Number item) {
		int indexItem = -1;
		if (!isNull(item) && !isNull(array)) {
			for(int i = array.length() - 1; i >= 0; --i) {
				if(array.get(i) == item) {
					indexItem = i;
					break;
				}
			}
		}
		return indexItem;
	}

	public boolean contains(Array<?> array, Number number) {
		boolean isContains = false;
		if (!isNull(number) && !isNull(array)) {
			for(Object item : array) {
				Number itemNumber = (Number)item;
				if(itemNumber.doubleValue() == number.doubleValue()) {
					isContains = true;
					break;
				}
			}	
		}
		return isContains;
	}
	
	public <Type> boolean clear(Array<Type> array) {
		boolean isClear = false;
		if(!isNull(array)) {
			for(int index = 0; index < array.length(); ++index) {
				Number zero = 0;
				array.set(index, (Type)zero);
			}
			isClear = true;
		}
		return isClear;
	}
	
	public <Type> boolean remove(Array<Type> array, Number item) {
		boolean isRemoved = false;
		if(!isNull(item) && !isNull(array)) {
			int index = indexOf(array, item);
			Number zero = 0;
			array.set(index, (Type)zero);
			isRemoved = true;
		}
		return isRemoved;
	}

	public boolean isEmpty(Array<?> array) {
		boolean isEmpty = true;
		if(!isNull(array)) {
			for(Object item : array) {
				Number itemNumber = (Number)item;
				if(itemNumber.doubleValue() != 0) {
					isEmpty = false;
					break;
				}
			}
		}
		return isEmpty;
	}
}