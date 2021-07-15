package by.company.kaliaha.task1.runner;

import by.company.kaliaha.task1.array.IntegerArray;
import by.company.kaliaha.task1.placeholder.FileFiller;
import by.company.kaliaha.task1.placeholder.Placeholder;
import by.company.kaliaha.task1.placeholder.RandomFiller;
import by.company.kaliaha.task1.service.Service;
import by.company.kaliaha.task1.utility.IllegalFileException;
import by.company.kaliaha.task1.utility.IncorrectMethodArgumentException;
import by.company.kaliaha.task1.utility.UndefinedTypeArrayInstanceException;

public class Runner {

	public static void main(String[] args) throws UndefinedTypeArrayInstanceException, IllegalFileException, IncorrectMethodArgumentException {
		testSort();
	}

	public static void testSort() throws UndefinedTypeArrayInstanceException, IllegalFileException {
		IntegerArray arrayInteger = new IntegerArray(8, 5, 2, 0, 4);
		System.out.println(arrayInteger.toString());
		arrayInteger.insertionSort();
		System.out.println(arrayInteger.toString());
		Placeholder placeHolder = new FileFiller();
		placeHolder.fillArray(arrayInteger);
		System.out.println(arrayInteger.toString());
	}

	public static void testService() throws UndefinedTypeArrayInstanceException, IllegalFileException, IncorrectMethodArgumentException {
		IntegerArray arrayInteger = new IntegerArray(10);
		Placeholder placeHolder = new RandomFiller(600);
		Service service = new Service();
		placeHolder.fillArray(arrayInteger);
		arrayInteger.insertionSort();
		System.out.println("Filled array: " + arrayInteger.toString());
		System.out.println("max value: " + service.max(arrayInteger));
		System.out.println("min value: " + service.min(arrayInteger));
		System.out.println("Prime numbers: " + service.findPrimeNumbers(arrayInteger).toString());
		System.out.println("Fibonacci number: " + service.findFibonacciNumbers(arrayInteger).toString());
		System.out.println("Numbers with unique digits: " + service.findNumbersWithUniqueDigits(arrayInteger, 2).toString());
	}

	public static void testFunctionalInteger() throws UndefinedTypeArrayInstanceException, IllegalFileException {
		IntegerArray arrayInteger = new IntegerArray(10);
		Placeholder placeHolder = new RandomFiller(400);
		placeHolder.fillArray(arrayInteger);
		System.out.println(arrayInteger.toString());
		arrayInteger.set(0, 1);
		System.out.println(arrayInteger.toString());
		int getInt = arrayInteger.get(0);
		System.out.println(getInt);
		int length = arrayInteger.length();
		System.out.println(length);
		int indexOfFirst = arrayInteger.indexOf(1);
		System.out.println(indexOfFirst);
		arrayInteger.set(7, 1);
		int indexOfLast = arrayInteger.lastIndexOf(1);
		System.out.println(indexOfLast);
		// arrayInteger.clear();
		// System.out.println(arrayInteger.toString());
		arrayInteger.remove(1);
		System.out.println(arrayInteger.toString());
		boolean isContains = arrayInteger.contains(1);
		System.out.println(isContains);
		arrayInteger.selectionSort();
		System.out.println(arrayInteger.toString());
		placeHolder.fillArray(arrayInteger);
		arrayInteger.bubbleSort();
		System.out.println(arrayInteger.toString());
		placeHolder.fillArray(arrayInteger);
		arrayInteger.insertionSort();
		System.out.println(arrayInteger.toString());
		arrayInteger.set(3, 289);
		System.out.println(arrayInteger.toString());
		arrayInteger.bubbleSort();
		System.out.println(arrayInteger.toString());
		int index = arrayInteger.binarySearch(289);
		System.out.println(index);
	}
}