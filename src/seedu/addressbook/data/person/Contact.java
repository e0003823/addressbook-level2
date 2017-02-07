package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {
	  	private String example = "";
	    private String message_constraints = "";
	    private String validation_regex = "";
	    private String value = "";
	    private boolean isPrivate;
	    
	    public Contact(String example, String message_constraints, String validation_regex, String value,
		        boolean isPrivate) throws IllegalValueException {
			super();
			this.example = example;
			this.message_constraints = message_constraints;
			this.validation_regex = validation_regex;
			this.isPrivate = isPrivate;
			
			String trimmedContact = value.trim();
	        this.isPrivate = isPrivate;
	        if (!isValidContact(trimmedContact)) {
	            throw new IllegalValueException(this.message_constraints);
	        }
	        this.value = trimmedContact;
		}
		
	    /**
		 * @return the example
		 */
		public String getExample() {
			return example;
		}
		/**
		 * @return the message_constraints
		 */
		public String getMessage_constraints() {
			return message_constraints;
		}
		/**
		 * @return the validation_regex
		 */
		public String getValidation_regex() {
			return validation_regex;
		}
		/**
		 * @return the value
		 */
		public String getValue() {
			return value;
		}
		/**
		 * @return the isPrivate
		 */
		public boolean isPrivate() {
			return isPrivate;
		}
		/**
		 * @param example the example to set
		 */
		public void setExample(String example) {
			this.example = example;
		}
		/**
		 * @param message_constraints the message_constraints to set
		 */
		public void setMessage_constraints(String message_constraints) {
			this.message_constraints = message_constraints;
		}
		/**
		 * @param validation_regex the validation_regex to set
		 */
		public void setValidation_regex(String validation_regex) {
			this.validation_regex = validation_regex;
		}
		/**
		 * @param value the value to set
		 */
		public void setValue(String value) {
			this.value = value;
		}
		/**
		 * @param isPrivate the isPrivate to set
		 */
		public void setPrivate(boolean isPrivate) {
			this.isPrivate = isPrivate;
		}
		
	    /**
	     * Returns true if a given string is a valid person email.
	     */
	    public boolean isValidContact(String trimmed) {
	        return trimmed.matches(validation_regex);
	    }

	    @Override
	    public String toString() {
	        return value;
	    }

	    @Override
	    public boolean equals(Object other) {
	        return other == this // short circuit if same object
	                || (other instanceof Contact // instanceof handles nulls
	                && this.value.equals(((Contact) other).value)); // state check
	    }

	    @Override
	    public int hashCode() {
	        return value.hashCode();
	    }
}
