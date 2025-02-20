package com.mc.coffeemanager.domain.payment;

import com.mc.coffeemanager.domain.order.Order;

public class Payment {

	private Order order;
	private int paymentPrice;

	public Payment(Order order) {
		super();
		this.order = order;
		this.paymentPrice = order.getOrderPrice();
	}

	public Order getOrder() {
		return order;
	}

	public int getPaymentPrice() {
		return paymentPrice;
	}

	public void proceed() {
		// TODO Auto-generated method stub
		
	}

}
