package com.nt.service;

import java.util.List;

import com.nt.model.OrderDataType;

public interface IOrderDataTypeService {

	public Integer saveOrderDataType(OrderDataType order);
	public OrderDataType getOneOrderDataType(Integer oid);
	public List<OrderDataType> getAllOrderDataType();
	public void updateOrderDataType(OrderDataType order);
	public void deleteeOrderDataType(Integer oid);
	public List<Object[]> getOrderDataTypeModeCount();
}
