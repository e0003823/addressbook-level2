package seedu.addressbook.data.person;

public class Street {
	public static final String EXAMPLE = "123";
	public static final String MESSAGE_STREET_CONSTRAINTS = "Street names should be alphanumeric.";
	//	    public static final String STREET_VALIDATION_REGEX = "\\d+";
	/**
	 * @return the example
	 */
	public static String getExample() {
		return EXAMPLE;
	}
	/**
	 * @return the messageStreetConstraints
	 */
	public static String getMessageStreetConstraints() {
		return MESSAGE_STREET_CONSTRAINTS;
	}
}
