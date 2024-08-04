package com.devsuperior.desafio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class DesafioApplication implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;
	private Order order;

	
	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		order = new Order();
		
		order.setCode(1034);
		order.setBasic(150);
		order.setDiscout(20);
		
		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order));
	}

}
