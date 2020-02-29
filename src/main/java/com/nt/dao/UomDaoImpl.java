package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.UomDataType;
@Repository
public class UomDaoImpl implements IUomDao {

	@Autowired
	private HibernateTemplate ht;
	
	
	@Override
	public Integer saveUomData(UomDataType uom) {
		
		return (Integer) ht.save(uom);
	}

	@Override
	public UomDataType getOneUomData(Integer uid) {
		
		return ht.get(UomDataType.class, uid);
	}

	@Override
	public List<UomDataType> getAllUomData() {
		
		return ht.loadAll(UomDataType.class);
	}

	@Override
	public void updateUomData(UomDataType uom) {
		ht.update(uom);

	}
@Override
public void deleteeUomData(Integer uid) {
	UomDataType uom=new  UomDataType();
	uom.setUid(uid);
	ht.delete(uom);
	
}
}
