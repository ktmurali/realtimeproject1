package com.nt.service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.IUomDao;
import com.nt.model.UomDataType;

@Service
public class UomServiceImpl implements IUomService {
	@Autowired
	private IUomDao dao;
	

	@Override
	@Transactional
	public Integer saveUomData(UomDataType uom) {
		
		return dao.saveUomData(uom);
	}

	@Override
	@Transactional(readOnly = true)
	public UomDataType getOneUomData(Integer uid) {
		
		return dao.getOneUomData(uid);
	}

	@Override
	@Transactional(readOnly = true)
	public List<UomDataType> getAllUomData() {
		List<UomDataType> list=dao.getAllUomData();
		Collections.sort(list,(o1,o2)->o1.getUid()-o2.getUid());
		return list;
	}

	@Override
	@Transactional
	public void updateUomData(UomDataType uom) {
		dao.updateUomData(uom);

	}

	@Override
	@Transactional
	public void deleteeUomData(Integer uid) {
		dao.deleteeUomData(uid);

	}

}
