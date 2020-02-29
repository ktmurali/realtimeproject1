package com.nt.dao;

import java.util.List;

import com.nt.model.ShipmentType;

public interface IShipmentDao {

	public Integer saveShipmentDetailes(ShipmentType e);
	public List<ShipmentType> getAllShipmentDetailes();
	public void deleteShipmentDetailes(Integer sid);
}
