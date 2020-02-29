package com.nt.service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.IShipmentDao;
import com.nt.model.ShipmentType;

@Service
public class ShipmentServiceImpl implements IShipmentService {
	@Autowired
	private IShipmentDao dao;

	@Override
	@Transactional
	public String saveShipmentDetailes(ShipmentType e) {
		Integer eid=null;
		String msg=null;
		eid=dao.saveShipmentDetailes(e);
		if(eid==0)
		{
			msg="Employee Registration failed";
		}
		else
		{
			msg="Employee Registration succeded";
		}
		return msg;
	}

	@Override
	@Transactional(readOnly = true)
	public List<ShipmentType> processShopmentDetailes() {
		List<ShipmentType> list=dao.getAllShipmentDetailes();
		Collections.sort(list,(o1,o2)->o1.getShipId()-o2.getShipId());
		return list;
	}

	@Override
	@Transactional
	public void deleteShipmentDetailes(Integer sid) {
		dao.deleteShipmentDetailes(sid);
	}

}
