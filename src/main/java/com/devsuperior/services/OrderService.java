package com.devsuperior.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shipmentService;
	
	public double total(Order order) {
		return (order.getBasic() - (order.getBasic() * (order.getDiscout()/100))) + shipmentService.shipment(order);
	}
}
