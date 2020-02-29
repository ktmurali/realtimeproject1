package com.nt.service;

import java.util.List;

import com.nt.model.ShipmentType;

public interface IShipmentService {
	
	public String saveShipmentDetailes(ShipmentType e);
	
	public List<ShipmentType> processShopmentDetailes();

	public void deleteShipmentDetailes(Integer sid);
}
