package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.IUploadDao;
import com.nt.model.UploadFileType;

@Service
public class UploadServiceImpl implements IUploadService {

	@Autowired
	private IUploadDao dao;

	@Override
	@Transactional
	public Integer savDocument(UploadFileType file) {
	
		return dao.savDocument(file);
	}

}
