package at.jku.cps.travart.dopler.decision.exc;

public class NotSupportedVariablityTypeException extends Exception {

	private static final long serialVersionUID = 8933296183753359841L;

	public NotSupportedVariablityTypeException(final String message) {
		super(message);
	}

	public NotSupportedVariablityTypeException(final Exception e) {
		super(e);
	}
}
