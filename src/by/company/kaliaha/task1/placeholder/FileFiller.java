package by.company.kaliaha.task1.placeholder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JFileChooser;

import by.company.kaliaha.task1.array.Array;
import by.company.kaliaha.task1.array.DoubleArray;
import by.company.kaliaha.task1.array.IntegerArray;
import by.company.kaliaha.task1.utility.IllegalFileException;
import by.company.kaliaha.task1.utility.UndefinedTypeArrayInstanceException;

public class FileFiller implements Placeholder{
	public FileFiller() {}
	
	public void fillArray(Array<?> array) throws UndefinedTypeArrayInstanceException, IllegalFileException {		
			if(array instanceof IntegerArray) {
				fillIntegerArray((IntegerArray)array);
			} else if(array instanceof DoubleArray) {
				fillDoubleArray((DoubleArray)array);
			} else {
				throw new UndefinedTypeArrayInstanceException("Undefined type array instance exception from " 
						+ getClass().getSimpleName() + "\nYour array is undefined for this class");
			}
	}
	
	private void fillIntegerArray(Array<Integer> array) throws IllegalFileException {
		String line = "";
		int index = 0;
		try {
			BufferedReader reader = getReader();
			while(index < array.length() && (line = reader.readLine()) != null) {
				array.set(index, Integer.valueOf(line));
				++index;
			}
		} catch(Exception e) {
			throw new IllegalFileException("Illegal file exception" 
					+ getClass().getSimpleName() + "\nFile is not contains needed values");
		}

	}
	
	private void fillDoubleArray(Array<Double> array) throws IllegalFileException {
		String line = "";
		int index = 0;
		try {
			BufferedReader reader = getReader();
			while(index < array.length() && (line = reader.readLine()) != null) {
					array.set(index, Double.valueOf(line));
					++index;
			}
		} catch(Exception e) {
			throw new IllegalFileException("Illegal file exception" 
					+ getClass().getSimpleName() + "\nFile is not contains needed values");
		}	
	}
	
	private BufferedReader getReader() throws FileNotFoundException{
		FileReader fileReader = new FileReader(getFile()); 
		return new BufferedReader(fileReader);
	}
	
	private File getFile() {
		JFileChooser fileChooser = new JFileChooser();
		int result = fileChooser.showOpenDialog(fileChooser);

		while (result != JFileChooser.APPROVE_OPTION) {
			result = fileChooser.showOpenDialog(fileChooser);
		}
		return fileChooser.getSelectedFile();
	}
}