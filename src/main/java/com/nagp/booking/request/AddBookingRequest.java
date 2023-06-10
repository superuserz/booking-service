package com.nagp.booking.request;

public class AddBookingRequest {
	/**
	 * ID from the catalog service for which booking is to be done
	 */
	private int serviceId;

	/**
	 * ID of the User Requesting the service
	 */
	private int userId;

	/**
	 * Amount To be Paid by Customer
	 */
	private double serviceAmount;

	/**
	 * Payment Mode for the Booking
	 */
	private String paymentMode;

	public AddBookingRequest() {
		super();
	}

	public AddBookingRequest(int serviceId, int userId, double serviceAmount, String paymentMode) {
		super();
		this.serviceId = serviceId;
		this.userId = userId;
		this.serviceAmount = serviceAmount;
		this.paymentMode = paymentMode;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public double getServiceAmount() {
		return serviceAmount;
	}

	public void setServiceAmount(double serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	@Override
	public String toString() {
		return "AddBookingRequest [serviceId=" + serviceId + ", userId=" + userId + ", serviceAmount=" + serviceAmount
				+ ", paymentMode=" + paymentMode + "]";
	}

}