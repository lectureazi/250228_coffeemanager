package com.mc.coffeemanager.domain.order;

import java.time.LocalDateTime;
import com.mc.coffeemanager.domain.coffee.Coffee;

public class Order {

	private String name;
	private Coffee coffee;
	private int orderCnt;
	private int orderPrice;
	private LocalDateTime orderTime;

	public Order(Coffee coffee, int orderCnt) {
		super();
		this.coffee = coffee;
		this.name = coffee.getName() + "[" + orderCnt + "]";
		this.orderCnt = orderCnt;
		this.orderPrice = coffee.getPrice() * orderCnt;
		this.orderTime = LocalDateTime.now();
	}

	public String getName() {
		return name;
	}

	public Coffee getCoffee() {
		return coffee;
	}

	public int getOrderCnt() {
		return orderCnt;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public LocalDateTime getOrderTime() {
		return orderTime;
	}

	public void proceed() {
		coffee.provide(orderCnt);
	}

}
