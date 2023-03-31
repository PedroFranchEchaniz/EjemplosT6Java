package ejercicio2;

public class ControlError extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ControlError() {
		
	}
	
	public ControlError(String error) {
		System.out.println("Error temperatura");
	}
}
