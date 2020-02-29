package com.nt.dao;

import java.util.List;

import com.nt.model.UploadFileType;

public interface IDownloadDao {
	public List<Object[]> getUplodData();
	public UploadFileType getDownloadData(Integer id);

}
