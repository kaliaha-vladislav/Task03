package by.company.kaliaha.task1.utility;

public class IllegalFileException extends Exception {
	private static final long serialVersionUID = 1L;

	public IllegalFileException () {
		super();
	}
	
	public IllegalFileException (String message) {
		super(message);
	}
	
	public IllegalFileException (String message, Throwable cause) {
		super(message, cause);
	}
	
	public IllegalFileException (Throwable cause) {
		super(cause);
	}
}
