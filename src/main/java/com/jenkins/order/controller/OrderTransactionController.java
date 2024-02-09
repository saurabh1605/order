package com.jenkins.order.controller;

import java.util.Objects;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.order.model.Order;
import com.jenkins.order.repository.OrderTransactionRepository;

@RestController
@RequestMapping("/order")
@Transactional(propagation = Propagation.NESTED)
public class OrderTransactionController {

	@Autowired
	OrderTransactionRepository orderTransactionRepository;

	@PostMapping("/saveOrder")
	public Order saveOrder(@RequestBody Order order) {
		System.out.println("In Save Order Deatils Method");
		if (Objects.nonNull(order)) {
			order.setUuid(StringUtils.hasText(order.getUuid()) ? order.getUuid() : UUID.randomUUID().toString());
			System.out.println("Inside if :: " + order);
		}
		return orderTransactionRepository.save(order);
	}

	@GetMapping("/getOrder/{orderId}")
	public Order getOrderDetails(@PathVariable int orderId) {
		System.out.println("In Get Order Deatils Method");
		return orderTransactionRepository.findByOrderId(orderId);

	}

	@PutMapping("/updateOrder/{orderId}")
	public Order updateOrder(@RequestBody Order order, @PathVariable int orderId) {
		{
			Order updateOrder = null;
			if (StringUtils.hasText(order.getUuid()) && Objects.nonNull(getOrderDetails(orderId))) {
				updateOrder = orderTransactionRepository.save(order);
			}

			return updateOrder;
		}
	}

	@DeleteMapping("/deleteOrder")
	public int deleteOrder(@RequestParam int orderId) {
		return orderTransactionRepository.deleteByOrderId(orderId);
	}

}
