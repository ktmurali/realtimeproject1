package com.nt.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.IOrderDao;
import com.nt.dao.IWhUserDataTypeDao;
import com.nt.model.WhUserDataType;

@Service
public class WhUserDataTypeServiceImpl implements IWhUserDataTypeService {

	@Autowired
	private IWhUserDataTypeDao dao;
	
	@Override
	@Transactional
	public Integer saveWhUserDataType(WhUserDataType order) {
		
		return dao.saveWhUserDataType(order);
	}

	@Override
	@Transactional(readOnly = true)
	public WhUserDataType getOneWhUserDataType(Integer oid) {
		
		return dao.getOneWhUserDataType(oid);
	}

	@Override
	@Transactional(readOnly = true)
	public List<WhUserDataType> getAllWhUserDataType() {
		List<WhUserDataType> list=dao.getAllWhUserDataType();
		Collections.sort(list,(o1,o2)->o1.getUserId()-o2.getUserId());
		return list;
	}

	@Override
	@Transactional
	public void updateWhUserDataType(WhUserDataType order) {
		dao.updateWhUserDataType(order);

	}

	@Override
	@Transactional
	public void deleteeWhUserDataType(Integer oid) {
		dao.deleteeWhUserDataType(oid);

	}

}
