package by.company.kaliaha.task1.placeholder;

import by.company.kaliaha.task1.array.Array;
import by.company.kaliaha.task1.utility.IllegalFileException;
import by.company.kaliaha.task1.utility.UndefinedTypeArrayInstanceException;

public interface Placeholder {
	void fillArray(Array<?> array) throws UndefinedTypeArrayInstanceException, IllegalFileException;
}
