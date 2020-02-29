package com.nt.service;

import java.util.List;

import com.nt.model.WhUserDataType;

public interface IWhUserDataTypeService {

	public Integer saveWhUserDataType(WhUserDataType whuser);
	public WhUserDataType getOneWhUserDataType(Integer wid);
	public List<WhUserDataType> getAllWhUserDataType();
	public void updateWhUserDataType(WhUserDataType whuser);
	public void deleteeWhUserDataType(Integer wid);
}
