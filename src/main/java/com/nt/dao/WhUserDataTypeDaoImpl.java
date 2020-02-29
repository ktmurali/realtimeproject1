package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.WhUserDataType;

@Repository
public class WhUserDataTypeDaoImpl implements IWhUserDataTypeDao {

	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveWhUserDataType(WhUserDataType whuser) {
		
		return (Integer) ht.save(whuser);
	}

	@Override
	public WhUserDataType getOneWhUserDataType(Integer oid) {
		return ht.get(WhUserDataType.class, oid);
	}

	@Override
	public List<WhUserDataType> getAllWhUserDataType() {
		List<WhUserDataType> list=ht.loadAll(WhUserDataType.class);
		return list;
	}

	@Override
	public void updateWhUserDataType(WhUserDataType whuser) {
		
		ht.update(whuser);
		
	}

	@Override
	public void deleteeWhUserDataType(Integer wid) {
		WhUserDataType whuser=new WhUserDataType();
		whuser.setUserId(wid);
		
		ht.delete(whuser);
		
	}

	



}
