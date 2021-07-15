package by.company.kaliaha.task1.placeholder;

import by.company.kaliaha.task1.array.Array;
import by.company.kaliaha.task1.array.DoubleArray;
import by.company.kaliaha.task1.array.IntegerArray;
import by.company.kaliaha.task1.utility.ConsoleScanner;
import by.company.kaliaha.task1.utility.UndefinedTypeArrayInstanceException;

public class ConsoleFiller implements Placeholder {
	private ConsoleScanner scanner;
	
	public ConsoleFiller() {
		scanner = new ConsoleScanner();
	}
	
	public void fillArray(Array<?> array) throws UndefinedTypeArrayInstanceException {			
		if(array instanceof IntegerArray) {
			fillIntegerArray((IntegerArray)array);
		} else if(array instanceof DoubleArray) {
			fillDoubleArray((DoubleArray)array);
		} else {
			throw new UndefinedTypeArrayInstanceException("Undefined type array instance exception from " 
									+ getClass().getSimpleName() + "\nYour array is undefined for this class");
		}
	}
	
	private void fillIntegerArray(Array<Integer> array) {
		int index = 0;		
		while(index != array.length()) {
			String message = "Input " + (array.length() - index) + " integer numbers";
			array.set(index, scanner.inputInt(message));
			++index;
		}
	}
	
	private void fillDoubleArray(Array<Double> array) {
		int index = 0;
		while(index != array.length()) {
			String message = "Input " + (array.length() - index) + " double numbers";
			array.set(index, scanner.inputDouble(message));
			++index;
		}
	}
}