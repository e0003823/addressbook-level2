package seedu.addressbook.data.person;

public class PostalCode {
	public static final String EXAMPLE = "123123";
	public static final String MESSAGE_POSTAL_CODE_CONSTRAINTS = "Postal code should consist of 6 digits.";
	//	    public static final String POSTAL_CODE_VALIDATION_REGEX = "\\d+";
	/**
	 * @return the example
	 */
	public static String getExample() {
		return EXAMPLE;
	}
	/**
	 * @return the messagePostalCodeConstraints
	 */
	public static String getMessagePostalCodeConstraints() {
		return MESSAGE_POSTAL_CODE_CONSTRAINTS;
	}
}
