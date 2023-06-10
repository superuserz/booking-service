package com.nagp.booking.exception;

/**
 * This class extends the base class {@link UCPBaseException} for providing the
 * framework for checked exception handling. The application should throw this
 * exception in case of business fault.
 */

public class BookingException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1393115699347678628L;

	private String errorCode;

	private String message;

	private String details;

	public BookingException() {
		super();
	}

	public BookingException(String errorCode, String message, String details) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.details = details;
	}

	public BookingException(String errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}