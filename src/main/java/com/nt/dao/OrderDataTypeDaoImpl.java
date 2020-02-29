package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.OrderDataType;

@Repository
public class OrderDataTypeDaoImpl implements IOrderDao {

	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveOrderDataType(OrderDataType order) {
		
		return (Integer) ht.save(order);
	}

	@Override
	public OrderDataType getOneOrderDataType(Integer oid) {
		return ht.get(OrderDataType.class, oid);
	}

	@Override
	public List<OrderDataType> getAllOrderDataType() {
		List<OrderDataType> list=ht.loadAll(OrderDataType.class);
		return list;
	}

	@Override
	public void updateOrderDataType(OrderDataType order) {
		
		ht.update(order);
		
	}

	@Override
	public void deleteeOrderDataType(Integer oid) {
		OrderDataType order=new OrderDataType();
		order.setOid(oid);
		
		ht.delete(order);
		
	}

	@Override
	public List<Object[]> getOrderDataTypeModeCount() {
		String hql="SELECT orderMode,count(orderMode) FROM com.nt.model.OrderDataType GROUP BY orderMode ";
		
		return (List<Object[]>) ht.find(hql);
	}

	



}
