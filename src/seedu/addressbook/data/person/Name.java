package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a Person's name in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidName(String)}
 */
public class Name extends Contact implements Printable{
	
    public static final String EXAMPLE = "John Doe";
    public static final String MESSAGE_NAME_CONSTRAINTS = "Person names should be spaces or alphabetic characters";
    public static final String NAME_VALIDATION_REGEX = "[\\p{Alpha} ]+";
    
    private final static boolean isPrivate = false;
	/**
	 * @param example
	 * @param message_constraints
	 * @param validation_regex
	 * @param value
	 * @param isPrivate
	 * @throws IllegalValueException
	 */
	public Name(String value)
	        throws IllegalValueException {
		super(EXAMPLE, MESSAGE_NAME_CONSTRAINTS, NAME_VALIDATION_REGEX, value, isPrivate);
	}

	@Override
	public String getPrintableString() {
		// TODO Auto-generated method stub
		return "Name: " + this.getValue();
	}

}
