package com.nt.dao;

import java.util.List;

import com.nt.model.UomDataType;

public interface IUomDao {

	public Integer saveUomData(UomDataType uom);
	public UomDataType getOneUomData(Integer uid);
	public List<UomDataType> getAllUomData();
	public void updateUomData(UomDataType uom);
	public void deleteeUomData(Integer uid);

	
}
