package com.nagp.booking.enums;

public enum PaymentModeEnum {

	COD("COD"),

	NETBANKING("NETBANKING"),

	WALLET("WALLET"),

	CARD("CARD");

	private String value;

	private PaymentModeEnum(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static PaymentModeEnum parse(final String value) {
		PaymentModeEnum paymentModeEnum = null; // Default
		for (PaymentModeEnum item : PaymentModeEnum.values()) {
			if (item.getValue().equals(value)) {
				paymentModeEnum = item;
				break;
			}
		}
		return paymentModeEnum;
	}
}
