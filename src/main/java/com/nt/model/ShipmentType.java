package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SHIPTAB123")
public class ShipmentType {
	
	@Id
	@Column(name = "SID")
	@GeneratedValue
	private int shipId;
	@Column(name = "SCODE")
	private String shipCode;
	@Column(name = "SMODE")
	private String shipMode;
	@Column(name = "SENABLE")
	private String shipEnable;
	
	@Column(name = "SGRADE")
	private String shipGrade;
	@Column(name = "SDESC")
	private String shipDesc;
	
	
	public int getShipId() {
		return shipId;
	}
	public void setShipId(int shipId) {
		this.shipId = shipId;
	}
	public String getShipCode() {
		return shipCode;
	}
	public void setShipCode(String shipCode) {
		this.shipCode = shipCode;
	}
	public String getShipMode() {
		return shipMode;
	}
	public void setShipMode(String shipMode) {
		this.shipMode = shipMode;
	}
	public String getShipEnable() {
		return shipEnable;
	}
	public void setShipEnable(String shipEnable) {
		this.shipEnable = shipEnable;
	}
	public String getShipGrade() {
		return shipGrade;
	}
	public void setShipGrade(String shipGrade) {
		this.shipGrade = shipGrade;
	}
	public String getShipDesc() {
		return shipDesc;
	}
	public void setShipDesc(String shipDesc) {
		this.shipDesc = shipDesc;
	}
	@Override
	public String toString() {
		return "Employee [shipId=" + shipId + ", shipCode=" + shipCode + ", shipMode=" + shipMode + ", shipEnable="
				+ shipEnable + ", shipGrade=" + shipGrade + ", shipDesc=" + shipDesc + "]";
	}
	

}
