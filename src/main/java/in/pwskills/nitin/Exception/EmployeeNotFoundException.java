package in.pwskills.nitin.Exception;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException() {
	}

	public EmployeeNotFoundException(String msg) {
		super(msg);
	}
	
}
