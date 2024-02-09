package com.jenkins.order.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jenkins.order.model.Order;

@Repository
public interface OrderTransactionRepository extends CrudRepository<Order, UUID>{
	
	@Query(value = "select a from Order a where a.orderId =:orderId ")
	public Order findByOrderId(int orderId);
	
	@Modifying
	@Query(value = "delete from Order a where a.orderId =:orderId ")
	public int deleteByOrderId(int orderId);

}
