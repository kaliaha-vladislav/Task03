package by.company.kaliaha.task1.placeholder;

import java.util.Random;

import by.company.kaliaha.task1.array.Array;
import by.company.kaliaha.task1.array.DoubleArray;
import by.company.kaliaha.task1.array.IntegerArray;
import by.company.kaliaha.task1.utility.Rounder;
import by.company.kaliaha.task1.utility.UndefinedTypeArrayInstanceException;

public class RandomFiller implements Placeholder{
	private Random random;
	private int bound;
	
	public RandomFiller(int bound) {
		random = new Random();
		if(bound > 0) {			
			this.bound = bound;
		} else {
			bound = 250;
		}
	}
	
	public void setBound(int bound) {
		if(bound > 0) {			
			this.bound = bound;
		} else if(bound == 0) {
			bound = 250;
		}
	}
	
	@Override
	public void fillArray(Array<?> array) throws UndefinedTypeArrayInstanceException {			
		if(array instanceof IntegerArray) {
			fillRandomIntegerArray((IntegerArray)array);
		} else if(array instanceof DoubleArray) {
			fillRandomDoubleArray((DoubleArray)array);
		} else {
			throw new UndefinedTypeArrayInstanceException("Undefined type array instance exception from " 
					+ getClass().getSimpleName() + "\nYour array is undefined for this class");
		}		
	}
	
	private void fillRandomIntegerArray(Array<Integer> array) {
		int index = 0;
		while(index != array.length()) {
			array.set(index, generateInt());
			++index;
		}
	}
	
	private int generateInt() {
		return random.nextInt(bound);
	}
	
	private void fillRandomDoubleArray(Array<Double> array) {
		int index = 0;
		while(index != array.length()) {
			array.set(index, generateInt() + Rounder.roundNumber(Math.random(), 3));
			++index;
		}
	}
}