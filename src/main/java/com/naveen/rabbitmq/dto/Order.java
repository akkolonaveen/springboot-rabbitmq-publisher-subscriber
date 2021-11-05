package com.naveen.rabbitmq.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
public class Order implements Serializable {

	
	private String orderId;
	
	private String name;
	
	private int qty;
	
	private double price;
	
}
