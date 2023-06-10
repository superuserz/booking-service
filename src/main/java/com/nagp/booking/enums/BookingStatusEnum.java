package com.nagp.booking.enums;

public enum BookingStatusEnum {

	NEW("NEW"),

	ASSIGNED("ASSIGNED"),

	ACCEPTED("ACCEPTED"),

	INPROCESS("INPROCESS"),

	COMPLETED("COMPLETED"),

	REJECTED("REJECTED");

	private String value;

	private BookingStatusEnum(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static BookingStatusEnum parse(final String value) {
		BookingStatusEnum bookingTypeEnum = null; // Default
		for (BookingStatusEnum item : BookingStatusEnum.values()) {
			if (item.getValue().equals(value)) {
				bookingTypeEnum = item;
				break;
			}
		}
		return bookingTypeEnum;
	}
}
