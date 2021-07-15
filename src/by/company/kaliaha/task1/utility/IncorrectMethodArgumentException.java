package by.company.kaliaha.task1.utility;

public class IncorrectMethodArgumentException extends Exception {
	private static final long serialVersionUID = 1L;

	public IncorrectMethodArgumentException () {
		super();
	}
	
	public IncorrectMethodArgumentException (String message) {
		super(message);
	}
	
	public IncorrectMethodArgumentException (String message, Throwable cause) {
		super(message, cause);
	}
	
	public IncorrectMethodArgumentException (Throwable cause) {
		super(cause);
	}
}
