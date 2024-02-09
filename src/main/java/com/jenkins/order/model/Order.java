package com.jenkins.order.model;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ORDER_DETAILS")
@Data
public class Order {
	@Id
	@Column(name = "ID",nullable = false)
	private String uuid;
	@Column(name = "ORDER_ID")
	private int orderId;
	@Column(name = "ORDER_NAME")
	private String orderName;
	@Column(name = "ORDER_DATE")
	private String orderDate;
	@Column(name = "AMOUNT")
	private long amount;
	@Column(name = "TRANSACTION_ID")
	private int transactionId;

}
