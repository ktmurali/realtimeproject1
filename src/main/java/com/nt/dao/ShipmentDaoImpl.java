package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.ShipmentType;

@Repository
public class ShipmentDaoImpl implements IShipmentDao {
	
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveShipmentDetailes(ShipmentType e) {
		Integer sno=(Integer) ht.save(e);
		return sno;
	}

	@Override
	public List<ShipmentType> getAllShipmentDetailes() {
		
		return ht.loadAll(ShipmentType.class);
	}

	@Override
	public void deleteShipmentDetailes(Integer sid) {
		ShipmentType s=new ShipmentType();
		s.setShipId(sid);
		ht.delete(s);
		
	}

	

}
