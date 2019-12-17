package com.weverton.projeto_web.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),	PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);

	private int code; // criar um campo - codigo do enumerado
	
	private OrderStatus(int code) { // Comstrutor tipo enumerado
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
