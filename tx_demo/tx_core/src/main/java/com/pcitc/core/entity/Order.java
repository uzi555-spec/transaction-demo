package com.pcitc.core.entity;

import java.io.Serializable;

/**
 * 
 * @author lixiang
 * @createTime 2019年7月24日 上午11:48:27 
 * 
 */
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	private int orderId;
	private int productId;
	private String customer;
	private int number;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "{'orderId':"+orderId+",'productId':"+productId+",'customer':'"+customer+"','number':"+number+"}";
	}
	
}
