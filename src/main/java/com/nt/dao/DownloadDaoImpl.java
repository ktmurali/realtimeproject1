package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.UploadFileType;

@Repository
public class DownloadDaoImpl implements IDownloadDao {

	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public List<Object[]> getUplodData() {
		String hql=" SELECT fileId,fileName FROM com.nt.model.UploadFileType";
				
		return (List<Object[]>) ht.find(hql);
	}

	@Override
	public UploadFileType getDownloadData(Integer id) {
		
		return ht.get(UploadFileType.class, id);
	}

}
