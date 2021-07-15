package by.company.kaliaha.task1.service;

import java.util.ArrayList;
import java.util.HashSet;

import by.company.kaliaha.task1.array.Array;
import by.company.kaliaha.task1.array.IntegerArray;
import by.company.kaliaha.task1.utility.IncorrectMethodArgumentException;

public class Service{	
	public Service() {}
	
	public int max(Array<Integer> array) throws IncorrectMethodArgumentException {
		checkArray(array);
		
		int max = Integer.MIN_VALUE;
		for(int item : array) {
			if(item > max) {
				max = item;
			}
		}
		return max;
	}
	
	private void checkArray(Array<Integer> array) throws IncorrectMethodArgumentException {
		if(array == null) {
			String message = "Incorrect method argument exception " + getClass().getSimpleName() 
								+ ":\n Array must not be null!";								
			throw new IncorrectMethodArgumentException(message);
		}		
	}
	
	public int min(Array<Integer> array) throws IncorrectMethodArgumentException {
		checkArray(array);
		
		int min = Integer.MAX_VALUE;
		for(int item : array) {
			if(item < min) {
				min = item;
			}
		}
		return min;
	}
	
	public IntegerArray findPrimeNumbers(Array<Integer> array) throws IncorrectMethodArgumentException {
		checkArray(array);
		
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		for(int item : array) {
			if(isPrime(item)) {
				primeList.add(item);
			}
		}
		return fillArray(primeList);
	}
	
	
	private boolean isPrime(int number) {
		boolean isPrime = true;
		if(number <= 0 || countDivisors(number) > 2) {
			isPrime = false;
		}
		return isPrime;
	}
	
	private int countDivisors(int number) {
		int countDivisors = 2;
		for(int divisor = 2; divisor < number; ++divisor) {
			if(number % divisor == 0) {
				++countDivisors;				
				break;
			}
		}
		return countDivisors;
	}
	
	private IntegerArray fillArray (ArrayList<Integer> list) {
		int index = 0;
		IntegerArray array = new IntegerArray(list.size());
		for(int i : list) {
			array.set(index, i);
			++index;
		}
		return array;
	}
	
	public IntegerArray findFibonacciNumbers(Array<Integer> array) throws IncorrectMethodArgumentException {
		checkArray(array);
		
		ArrayList<Integer> fibonacci = createFibonacciNumbers(array);
		ArrayList<Integer> arrayFibonacci = new ArrayList<Integer>();
		for(int item : array) {
			if(fibonacci.contains(item) && !arrayFibonacci.contains(item)) {
				arrayFibonacci.add((Integer)item);
			}
		}
		return fillArray(arrayFibonacci);
	}
	
	private ArrayList<Integer> createFibonacciNumbers(Array<Integer> array) throws IncorrectMethodArgumentException{
		int bound = max(array);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		int index = 1;
		for(int i = 1; i <= bound; ++i) {
			int sum = list.get(index) + list.get(index - 1);
			if(sum == i) {
				list.add(i);
				++index;
			}
		}
		return list;
	}	
	
	public IntegerArray findNumbersWithUniqueDigits(Array<Integer> array, int countsDozens) 
			throws IncorrectMethodArgumentException{
		checkArray(array);
		if(countsDozens < 0) {
			String message = "Illegal argument in method exception from " + getClass().getSimpleName() 
					+ ":\n CountsDozens must be more than 0!";
			throw new IncorrectMethodArgumentException(message);
		}
		
		int condition = countsDozens;
		ArrayList<Integer> numbersWithUniqueDigits = new ArrayList<Integer>();
		for(int item : array) {
			HashSet<Integer> digits = fallNumberIntoDigits(item, condition);		
			if(digits.size() == condition + 1) {
				numbersWithUniqueDigits.add(item);
			}
		}
		return fillArray(numbersWithUniqueDigits);
	}
	
	private HashSet<Integer> fallNumberIntoDigits(int number, int condition){
		HashSet<Integer> digits = new HashSet<Integer>();
		if(number > Math.pow(10, condition)) {
			while(number != 0) {
				digits.add(number % 10);
				number = number / 10;
			}	
		}
		return digits;
	}
}