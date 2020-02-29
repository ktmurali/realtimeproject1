package com.nt.dao;

import java.util.List;

import com.nt.model.WhUserDataType;
import com.nt.model.UomDataType;

public interface IWhUserDataTypeDao {
	
	
	public Integer saveWhUserDataType(WhUserDataType whuser);
	public WhUserDataType getOneWhUserDataType(Integer wid);
	public List<WhUserDataType> getAllWhUserDataType();
	public void updateWhUserDataType(WhUserDataType whuser);
	public void deleteeWhUserDataType(Integer wid);
}
