package by.company.kaliaha.task1.service;

import org.junit.Assert;
import org.junit.Test;

import by.company.kaliaha.task1.array.IntegerArray;
import by.company.kaliaha.task1.service.Service;
import by.company.kaliaha.task1.utility.IncorrectMethodArgumentException;

public class ServiceTest {
	@Test
	public void maxTest_Correct_Arguments() throws IncorrectMethodArgumentException {
		IntegerArray array = new IntegerArray(4, 7, 1, 9, 10, 5, 222);
		Service service = new Service();
		int expected = 222;
		int actual = service.max(array);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = IncorrectMethodArgumentException.class)
	public void maxTest_Incorrect_Arguments() throws IncorrectMethodArgumentException {
		Service service = new Service();
		int expected = 0;
		int actual = service.max(null);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void minTest_Correct_Arguments() throws IncorrectMethodArgumentException {
		IntegerArray array =  new IntegerArray(4, 7, 1, 9, 10, 5, 222);
		Service service = new Service();
		int expected = 1;
		int actual = service.min(array);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = IncorrectMethodArgumentException.class)
	public void minTest_Incorrect_Arguments() throws IncorrectMethodArgumentException {
		Service service = new Service();
		int expected = 0;
		int actual = service.min(null);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void findPrimeNumbersTest_Correct_Arguments() throws IncorrectMethodArgumentException {
		IntegerArray array = new IntegerArray(4, 7, 1, 9, 10, 5, 222);
		Service service = new Service();
		IntegerArray expected = new IntegerArray(7, 1, 5); 
		IntegerArray actual = service.findPrimeNumbers(array);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = IncorrectMethodArgumentException.class)
	public void findPrimeNumbersTest_Incorrect_Arguments() throws IncorrectMethodArgumentException {
		Service service = new Service();
		int expected = 0;
		int actual = service.min(null);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void findFibonacciNumbersTest_Correct_Arguments() throws IncorrectMethodArgumentException {
		IntegerArray array =  new IntegerArray(4, 7, 1, 9, 10, 5, 222);
		Service service = new Service();
		IntegerArray expected = new IntegerArray(1, 5); 
		IntegerArray actual = service.findFibonacciNumbers(array);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = IncorrectMethodArgumentException.class)
	public void findFibonacciNumbersTest_Incorrect_Arguments() throws IncorrectMethodArgumentException {
		Service service = new Service();
		int expected = 0;
		int actual = service.min(null);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void findNumbersWithUniqueDigitsTest_Correct_Arguments() throws IncorrectMethodArgumentException {
		IntegerArray array =  new IntegerArray(4, 7, 1, 9, 10, 5, 214, 543);
		Service service = new Service();
		IntegerArray expected = new IntegerArray(214, 543); 
		IntegerArray actual = service.findNumbersWithUniqueDigits(array, 2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = IncorrectMethodArgumentException.class)
	public void findNumbersWithUniqueDigitsTest_Incorrect_Arguments() throws IncorrectMethodArgumentException {
		Service service = new Service();
		int expected = 0;
		int actual = service.min(null);
		Assert.assertEquals(expected, actual);
	}
}