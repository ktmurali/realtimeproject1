package com.nt.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.IOrderDao;
import com.nt.model.OrderDataType;

@Service
public class OrderDataTypeServiceImpl implements IOrderDataTypeService {

	@Autowired
	private IOrderDao dao;
	
	@Override
	@Transactional
	public Integer saveOrderDataType(OrderDataType order) {
		
		return dao.saveOrderDataType(order);
	}

	@Override
	@Transactional(readOnly = true)
	public OrderDataType getOneOrderDataType(Integer oid) {
		
		return dao.getOneOrderDataType(oid);
	}

	@Override
	@Transactional(readOnly = true)
	public List<OrderDataType> getAllOrderDataType() {
		List<OrderDataType> list=dao.getAllOrderDataType();
		Collections.sort(list,(o1,o2)->o1.getOid()-o2.getOid());
		return list;
	}

	@Override
	@Transactional
	public void updateOrderDataType(OrderDataType order) {
		dao.updateOrderDataType(order);

	}

	@Override
	@Transactional
	public void deleteeOrderDataType(Integer oid) {
		dao.deleteeOrderDataType(oid);

	}

	@Override
	public List<Object[]> getOrderDataTypeModeCount() {
		
		return dao.getOrderDataTypeModeCount();
	}

}
