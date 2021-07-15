/*
 * %W% %E% Vladzislav Kaliaha 
 */
package by.company.kaliaha.task1.utility;

/**
 * The class is a helper that helps round a floating point value 
 * to a specified number of decimal places.
 *
 * @version   1.4 19 May 2021
 * @author    Vladzislav Kaliaha
 */
public class Rounder {
	public Rounder() {}
	/**
	 * The method is used to round real numbers to a certain decimal place.
	 * @param number The number to be rounded.
	 * @param power  A number of simbols after comma.
	 */
	public static double roundNumber(double number, int power) {
		int numberOfSigns = (int) Math.pow(10, power);
		double roundedNumber = (double) Math.round(number * numberOfSigns) / numberOfSigns;	
		return 	roundedNumber;
	}
}