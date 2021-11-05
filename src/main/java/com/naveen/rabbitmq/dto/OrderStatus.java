package com.naveen.rabbitmq.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
public class OrderStatus  implements Serializable{
	
	private Order order;
	
	private String status;
	
	private String message;
	

}
