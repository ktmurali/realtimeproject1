package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.IDownloadDao;
import com.nt.model.UploadFileType;
@Service
public class DownloadServiceImpl implements IDownloadService {

	@Autowired
	private IDownloadDao dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Object[]> getUplodData() {
		
		return dao.getUplodData();
	}

	@Override
	public UploadFileType getDownloadData(Integer id) {
		
		return dao.getDownloadData(id);
	}

}
