package seedu.addressbook.data.person;

public class Unit {
	public static final String EXAMPLE = "#12-34";
	public static final String MESSAGE_UNIT_CONSTRAINTS = "Unit numbers should begin with a '#' followed by a unit number";
	//	    public static final String UNIT_VALIDATION_REGEX = "\\d+";
	/**
	 * @return the example
	 */
	public static String getExample() {
		return EXAMPLE;
	}
	/**
	 * @return the messageUnitConstraints
	 */
	public static String getMessageUnitConstraints() {
		return MESSAGE_UNIT_CONSTRAINTS;
	}
}
