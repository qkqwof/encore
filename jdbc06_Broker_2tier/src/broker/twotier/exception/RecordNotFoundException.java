package broker.twotier.exception;

public class RecordNotFoundException extends Exception{
	public RecordNotFoundException() {
		
	}
	
	public RecordNotFoundException(String message) {
		super(message);
	}
}
