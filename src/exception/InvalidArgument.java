package exception;

public class InvalidArgument extends Exception {

	/**
	 * This InvalidArgument exception is thrown when some one input wrong exceptions
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidArgument() {
		super();
	}
	
	public InvalidArgument(String msg) {
		super(msg);
	}
	public InvalidArgument(Throwable t) {
		super(t);
	}

}   
