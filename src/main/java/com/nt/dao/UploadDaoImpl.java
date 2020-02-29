package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.UploadFileType;

@Repository
public class UploadDaoImpl implements IUploadDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer savDocument(UploadFileType file) {
		
		return (Integer) ht.save(file);
	}

}
