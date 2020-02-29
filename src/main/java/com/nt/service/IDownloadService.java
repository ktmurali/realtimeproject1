package com.nt.service;

import java.util.List;

import com.nt.model.UploadFileType;

public interface IDownloadService {

	public List<Object[]> getUplodData();
	public UploadFileType getDownloadData(Integer id);
}
