package by.company.kaliaha.task1.utility;

public class UndefinedTypeArrayInstanceException extends Exception{
	private static final long serialVersionUID = 1L;

	public UndefinedTypeArrayInstanceException () {
		super();
	}
	
	public UndefinedTypeArrayInstanceException (String message) {
		super(message);
	}
	
	public UndefinedTypeArrayInstanceException (String message, Throwable cause) {
		super(message, cause);
	}
	
	public UndefinedTypeArrayInstanceException (Throwable cause) {
		super(cause);
	}
}
